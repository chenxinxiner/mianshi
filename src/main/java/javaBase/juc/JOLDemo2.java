package javaBase.juc;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

public class JOLDemo2 {
    private static Object  o;
    public static void main(String[] args) {
        o = new Object();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
