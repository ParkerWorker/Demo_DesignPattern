package demo.designPattern.singleton;

/**
 * 枚举方式单例模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 15:54
 **/
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString(){
        return "枚举方式单例模式 - 是所用单例实现中唯一一种不会被破坏的单例实现模式。";
    }
}
