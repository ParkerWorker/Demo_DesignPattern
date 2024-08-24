package demo.designPattern.singleton;

/**
 * 饿汉式-方式2（静态代码块方式）
 * 和饿汉式的方式1基本上一样，也存在内存浪费问题
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:41
 **/
public class HungryMan02 {

    //私有构造方法
    private HungryMan02() {}

    //在成员位置创建该类的对象
    private static final HungryMan02 instance;

    static {
        instance = new HungryMan02();
    }

    //对外提供静态方法获取该对象
    public static HungryMan02 getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "饿汉式-方式2（静态代码块方式）- 和饿汉式的方式1基本上一样，也存在内存浪费问题。";
    }
}
