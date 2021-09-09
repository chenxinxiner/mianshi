package javaBase.juc.locksupporttest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * LockSupport学习
 *
 * @author ：chenxin
 * @date ：Created in 2021/7/12 21:54
 */
public class LockSupportTest {

    public static void main(String[] args) {
        Thread a = new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+"线程等待");
            LockSupport.park();
            System.out.println(Thread.currentThread().getName()+"线程被唤醒");

        },"a");
        Thread b = new Thread(() ->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LockSupport.unpark(a);
            System.out.println(Thread.currentThread().getName()+"线程Unpark");
        },"b");

        a.start();
        b.start();
        String a1 = "s";
    }
}
