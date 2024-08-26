package demo.designPattern.facade.items;

/**
 * 模拟电视类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:57
 **/
public class TV {
    public void on() {
        System.out.println("打开了电视....");
    }

    public void off() {
        System.out.println("关闭了电视....");
    }
}
