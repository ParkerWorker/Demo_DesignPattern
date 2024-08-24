package org.localhost.demo.designPattern.singleton;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.Serializable;

/**
 * 懒汉式-方式3（双重检查锁改进版）- 使用 volatile 关键字, 并解决序列化和反射破坏单例模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 16:34
 **/
public class SafeLazy02 implements Serializable {

    //私有构造方法
    private SafeLazy02() {
        if (instance != null) {
            throw new RuntimeException("禁止反射 - 破解单例模式。");
        }
    }

    private static volatile SafeLazy02 instance;

    //对外提供静态方法获取该对象
    public static SafeLazy02 getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实际
        if (instance == null) {
            synchronized (SafeLazy02.class) {
                //抢到锁之后再次判断是否为空
                if (instance == null) {
                    instance = new SafeLazy02();
                }
            }
        }
        return instance;
    }


    private static final Logger LOGGER = LoggerFactory.getLogger(SafeLazy02.class);

    //下面是为了解决序列化反序列化破解单例模式
    private Object readResolve() {
        LOGGER.debug("为了解决序列化反序列化破解单例模式：新增了 readResolve() 方法。");
        return SafeLazy02.instance;
    }

    @Override
    public String toString() {
        return "解决序列化和反射破坏单例模式";
    }
}
