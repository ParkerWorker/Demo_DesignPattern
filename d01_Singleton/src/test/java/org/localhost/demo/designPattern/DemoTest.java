package org.localhost.demo.designPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.localhost.demo.designPattern.singleton.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式测试
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:36
 **/
public class DemoTest {

    @Before
    public void println() {
        System.out.println();
    }

    @Test
    public void testHungryMan01() {
        System.out.println(HungryMan01.getInstance().toString());
    }

    @Test
    public void testHungryMan02() {
        System.out.println(HungryMan02.getInstance().toString());
    }

    @Test
    public void testLazy01() {
        System.out.println(Lazy01.getInstance().toString());
    }

    @Test
    public void testLazy02() {
        System.out.println(Lazy02.getInstance().toString());
    }

    @Test
    public void testLazy03() {
        System.out.println(Lazy03.getInstance().toString());
    }

    @Test
    public void testEnum() {
        System.out.println(EnumSingleton.INSTANCE);
    }

    private final static String PATH = "C:\\Users\\12208\\Desktop\\a.txt";

    @Test
    public void testSerializeCloneWithPath() throws IOException, ClassNotFoundException {
        printMessage(Lazy02.class, Lazy02.getInstance(), SingleClone.cloneSingleWithSerialization(Lazy02.getInstance(), PATH));
        printMessage(SafeLazy02.class, SafeLazy02.getInstance(), SingleClone.cloneSingleWithSerialization(SafeLazy02.getInstance(), PATH));
    }

    @Test
    public void testConstructorClone() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        printMessage(Lazy02.class, Lazy02.getInstance(), SingleClone.cloneSingletonWithReflect(Lazy02.class));

        Assert.assertThrows(InvocationTargetException.class, () -> {
            try {
                printMessage(SafeLazy02.class, SafeLazy02.getInstance(), SingleClone.cloneSingletonWithReflect(SafeLazy02.class));
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        });
    }

    private static void printMessage(Class<?> clazz, Object obj1, Object obj2) {
        System.out.print(clazz);
        if (obj1 == obj2) {
            System.out.println("：序列化无法破坏单例模式。");
        } else {
            System.out.println("：序列化已经破坏单例模式。");
        }
    }
}
