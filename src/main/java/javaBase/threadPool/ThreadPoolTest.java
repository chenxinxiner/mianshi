package javaBase.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    private final static int COURE_SIZE = 5;
    private final static int MAX_SIZE = 100;
    private final static long KEEP_LIVE_TIME = 1;
    private final static int QUEUE_CAPACITY = 100;


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                COURE_SIZE, MAX_SIZE,
                KEEP_LIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 20; i++) {
            //创建WorkerThread对象（WorkerThread类实现了Runnable 接口）
            Runnable worker = new MyRunnable(i);
            //执行Runnable
            threadPoolExecutor.execute(worker);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()) {
        }

        System.out.println("Finished all threads");

    }
}
