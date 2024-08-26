package demo.designPattern.facade.items;

/**
 * 模拟空调类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:58
 **/
public class AirCondition {
    public void on() {
        System.out.println("打开了空调....");
    }

    public void off() {
        System.out.println("关闭了空调....");
    }
}
