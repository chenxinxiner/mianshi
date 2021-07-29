package designpatterns.singel;

/**
 * 内部类实现单例模式
 *
 * @author ：chenxin
 * @date ：Created in 2021/7/28 21:27
 */
public class InnerClass {

    private InnerClass(){

    }

    public static InnerClass getInstance() {
        return RealInnerClass.innerClass;
    }

    private static class RealInnerClass{

        private final static InnerClass innerClass = new InnerClass();

    }
}
