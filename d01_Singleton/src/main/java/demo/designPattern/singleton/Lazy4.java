package demo.designPattern.singleton;

import java.io.Serializable;

/**
 * 懒汉式-方式3（双重检查锁改进版）- 使用 volatile 关键字
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:46
 **/
public class Lazy4 implements Serializable {
    //私有构造方法
    private Lazy4() {}

    private static volatile Lazy4 instance;

    //对外提供静态方法获取该对象
    public static Lazy4 getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实际
        if(instance == null) {
            synchronized (Lazy4.class) {
                //抢到锁之后再次判断是否为空
                if(instance == null) {
                    instance = new Lazy4();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "懒汉式-方式3（双重检查锁改进版）- 解决双重检查锁模式带来空指针异常的问题，使用 `volatile` 关键字";
    }
}
