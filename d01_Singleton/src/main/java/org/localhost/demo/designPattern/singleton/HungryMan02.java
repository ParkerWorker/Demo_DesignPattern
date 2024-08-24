package org.localhost.demo.designPattern.singleton;

/**
 * 懒汉式-方式2（线程安全）
 * 添加了 synchronized 关键字，导致该方法的 执行效率特别低。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:41
 **/
public class HungryMan02 {
    //私有构造方法
    private HungryMan02() {}

    //在成员位置创建该类的对象
    private static HungryMan02 instance;

    //对外提供静态方法获取该对象
    public static synchronized HungryMan02 getInstance() {
        if(instance == null) {
            instance = new HungryMan02();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "懒汉式-方式2（线程安全）- 添加了 synchronized 关键字，导致该方法的 执行效率特别低。";
    }
}
