package demo.designPattern.facade.items;

/**
 * 灯类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:57
 **/
public class Light {
    public void on() {
        System.out.println("打开了灯....");
    }

    public void off() {
        System.out.println("关闭了灯....");
    }
}
