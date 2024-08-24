package demo.designPattern.singleton;

/**
 * 懒汉式-方式1（线程不安全）- 会出现 线程安全问题
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:29
 **/
public class Lazy1 {
    //私有构造方法
    private Lazy1() {}

    //在成员位置创建该类的对象
    private static Lazy1 instance;

    //对外提供静态方法获取该对象
    public static Lazy1 getInstance() {
        if(instance == null) {
            instance = new Lazy1();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "懒汉式-方式1（线程不安全）- 会出现 线程安全问题";
    }
}
