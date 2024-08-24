package org.localhost.demo.designPattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式克隆
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:58
 **/
public class SingleClone {

    /**
     * 使用序列化克隆，单例模式
     *
     * @param singleton 单例对象
     * @param path      序列化输出的文件
     * @param <T>       克隆的类
     * @return 返回克隆对象
     */
    public static <T extends Serializable> T cloneSingleWithSerialization(T singleton,final String path) throws IOException, ClassNotFoundException {
        if (singleton == null)
            return null;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(singleton);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object instance = ois.readObject();
        ois.close();
        return (T) instance;
    }

    /**
     * 使用序列化克隆，单例模式
     *
     * @param singleton 单例对象
     * @param <T>       克隆的类
     * @return 返回克隆对象
     */
    public static <T extends Serializable> T cloneSingleWithSerialization(T singleton) throws IOException, ClassNotFoundException {
        if (singleton == null)
            return null;

        ByteArrayOutputStream aos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(aos);
        oos.writeObject(singleton);
        byte[] arr = aos.toByteArray();
        oos.close();

        ByteArrayInputStream ais = new ByteArrayInputStream(arr);
        ObjectInputStream ois = new ObjectInputStream(ais);
        Object instance = ois.readObject();
        ois.close();
        return (T) instance;
    }

    /**
     * 使用构造器克隆，单例模式
     *
     * @param clazz 单例类型对象
     * @param <T>   克隆的类
     * @return 返回克隆对象
     */
    public static <T> T cloneSingletonWithReflect(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Singleton类的私有无参构造方法对象
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton类的对象并返回
        return constructor.newInstance();
    }
}
