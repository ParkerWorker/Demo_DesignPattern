package org.localhost.demo.designPattern.singleton;

/**
 * 饿汉式-方式1（静态变量方式）
 * 一直没有使用就会造成 内存的浪费
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:34
 **/
public class HungryMan01 {
    //私有构造方法
    private HungryMan01() {}

    //在成员位置创建该类的对象
    private static final HungryMan01 instance = new HungryMan01();

    //对外提供静态方法获取该对象
    public static HungryMan01 getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "饿汉式-方式1（静态变量方式）- 一直没有使用就会造成 内存的浪费。";
    }
}
