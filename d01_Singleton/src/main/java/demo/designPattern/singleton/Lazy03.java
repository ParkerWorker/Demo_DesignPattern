package demo.designPattern.singleton;

/**
 * 懒汉式-方式4（静态内部类方式）
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:49
 **/
public class Lazy03 {
    //私有构造方法
    private Lazy03() {}

    private static class SingletonHolder {
        private static final Lazy03 INSTANCE = new Lazy03();
    }

    //对外提供静态方法获取该对象
    public static Lazy03 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public String toString() {
        return "懒汉式-方式4（静态内部类方式）- \r\n" +
                "   加载 Lazy03 类时不会去初始化 INSTANCE, 只有第一次调用 getInstance，虚拟机加载 SingletonHolder。并初始化 INSTANCE，这样不仅能确保线程安全，也能保证 Lazy03 类的唯一性\r\n" +
                "   静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。";
    }
}
