package juc;

import org.openjdk.jol.info.ClassLayout;

public class JOLDemo {
    private static Object  o;
    public static void main(String[] args) {
        o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        System.out.println("==============加锁后变化==========");
        System.out.println();
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
