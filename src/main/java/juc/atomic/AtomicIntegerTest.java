package juc.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger  演示ABA问题
 *
 * @author ：chenxin
 * @date ：Created in 2021/6/29 20:17
 */
public class AtomicIntegerTest {

    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            int currentValue = atomicInteger.get();
            System.out.println(Thread.currentThread().getName() + "------ crrrentValue = " + currentValue);
            // 模拟业务耗费的时间
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean casResult = atomicInteger.compareAndSet(1, 2);
            System.out.println(Thread.currentThread().getName()
                    + "------- currentValue" + currentValue
                    + ", finalVale =" + atomicInteger.get()
                    + "，compareAndSet Result = " + casResult);
        });

        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();

        Thread thread2 = new Thread(() -> {
            int currentValue = atomicInteger.get();
            boolean casResult = atomicInteger.compareAndSet(1, 2);
            System.out.println(Thread.currentThread().getName()
                    + "------- currentValue" + currentValue
                    + ", finalVale =" + atomicInteger.get()
                    + "，compareAndSet Result = " + casResult);
            currentValue = atomicInteger.get();
            casResult = atomicInteger.compareAndSet(2, 1);
            System.out.println(Thread.currentThread().getName()
                    + "------- currentValue" + currentValue
                    + ", finalVale =" + atomicInteger.get()
                    + "，compareAndSet Result = " + casResult);
        });

        thread2.start();
    }
}
