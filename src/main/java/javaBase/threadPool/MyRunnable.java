package javaBase.threadPool;

import java.util.Date;

public class MyRunnable implements Runnable{

    private Integer i;

    public MyRunnable(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+",thredId:"+Thread.currentThread().getId()+"  "+i+ "  Start. Time = " + new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+",thredId:"+Thread.currentThread().getId()+"  "+i+ "  End. Time = " + new Date());
    }
}
