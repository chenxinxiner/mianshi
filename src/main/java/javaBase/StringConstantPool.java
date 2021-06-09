package javaBase;

public class StringConstantPool {

    public static void main(String[] args) {
        String tongcheng = new StringBuilder().append("58").append("tongcheng").toString();
        System.out.println(tongcheng);
        System.out.println(tongcheng.intern());
        System.out.println(tongcheng == tongcheng.intern());

        System.out.println();

        String java = new StringBuilder().append("ja").append("va").toString();
        System.out.println(java);
        System.out.println(java.intern());
        System.out.println(java == java.intern());
    }

}
