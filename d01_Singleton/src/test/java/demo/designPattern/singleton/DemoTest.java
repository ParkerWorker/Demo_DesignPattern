package demo.designPattern.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void testLazy1(){
        System.out.println(Lazy1.getInstance().toString());
    }

    @Test
    public void testLazy2(){
        System.out.println(Lazy2.getInstance().toString());
    }

    @Test
    public void testLazy3() {
        System.out.println(Lazy3.getInstance().toString());
    }

    @Test
    public void testLazy4() {
        System.out.println(Lazy4.getInstance().toString());
    }

    @Test
    public void testLazy5() {
        System.out.println(Lazy5.getInstance().toString());
    }

    @Test
    public void testEnum() {
        System.out.println(EnumSingleton.INSTANCE);
    }

    private final static String PATH = "C:\\Users\\12208\\Desktop\\a.txt";

    @Test
    public void testSerializeCloneWithPath() throws IOException, ClassNotFoundException {
        printMessage(Lazy4.class, Lazy4.getInstance(), SingleClone.cloneSingleWithSerialization(Lazy4.getInstance(), PATH));
        printMessage(SafeLazy02.class, SafeLazy02.getInstance(), SingleClone.cloneSingleWithSerialization(SafeLazy02.getInstance(), PATH));
    }

    @Test
    public void testConstructorClone() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        printMessage(Lazy4.class, Lazy4.getInstance(), SingleClone.cloneSingletonWithReflect(Lazy4.class));

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
