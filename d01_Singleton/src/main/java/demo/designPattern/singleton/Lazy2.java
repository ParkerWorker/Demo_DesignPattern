package demo.designPattern.singleton;

/**
 * 懒汉式-方式2（线程安全） - 方法上添加了 synchronized 关键字，导致执行效率特别低
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:31
 **/
public class Lazy2 {
    //私有构造方法
    private Lazy2() {}

    //在成员位置创建该类的对象
    private static Lazy2 instance;

    //对外提供静态方法获取该对象
    public static synchronized Lazy2 getInstance() {
        if(instance == null) {
            instance = new Lazy2();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "懒汉式-方式2（线程安全） - 方法上添加了 synchronized 关键字，导致执行效率特别低";
    }
}
