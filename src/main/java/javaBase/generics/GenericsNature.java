package javaBase.generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericsNature {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Java 中的泛型是伪泛型，因为 Java 在编译期间，所有的泛型信息都会被擦掉，这也就是通常所说类型擦除
        List<Integer> list = new ArrayList<>();

        list.add(12);
        //这里直接添加会报错
        // list.add("a");
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //但是通过反射添加，是可以的   秒啊

        add.invoke(list, "kl");

        System.out.println(list);
    }
}
