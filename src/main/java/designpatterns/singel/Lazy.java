package designpatterns.singel;

/**
 * 懒加载单例模式实现
 *
 * @author ：chenxin
 * @date ：Created in 2021/7/28 21:23
 */
public class Lazy {

    private static volatile Lazy lazye;

    private Lazy() {

    }

    /**
     * 双重重入锁实现单例模式
     *
     * @return designpatterns.singel.Lazy
     * @author chenxin
     * @date 2021/7/28 21:26
     **/
    public static Lazy getInstance() {
        if (lazye == null) {
            synchronized (Lazy.class) {
                if (lazye == null) {
                    lazye = new Lazy();
                }
            }
        }
        return lazye;
    }
}
