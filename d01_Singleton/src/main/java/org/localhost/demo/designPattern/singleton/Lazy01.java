package org.localhost.demo.designPattern.singleton;

/**
 * 懒汉式-方式3（双重检查锁）
 * 在多线程的情况下，可能会 出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:43
 **/
public class Lazy01 {
    //私有构造方法
    private Lazy01() {}

    private static Lazy01 instance;

    //对外提供静态方法获取该对象
    public static Lazy01 getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized (Lazy01.class) {
                //抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Lazy01();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "懒汉式-方式3（双重检查锁）- 在多线程的情况下，可能会 出现空指针问题。其原因是JVM在实例化对象的时候会进行优化和指令重排序操作。";
    }
}
