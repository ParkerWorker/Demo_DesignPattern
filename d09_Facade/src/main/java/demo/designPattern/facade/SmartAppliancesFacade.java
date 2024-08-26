package demo.designPattern.facade;

import demo.designPattern.facade.items.AirCondition;
import demo.designPattern.facade.items.Light;
import demo.designPattern.facade.items.TV;

/**
 * 智能音箱 - 使用门面模式控制 Light 等家电
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:58
 **/
public class SmartAppliancesFacade {
    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    /**
     * 模拟语音指令
     *
     * @param message 语音指令
     */
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    //起床后一键开电器
    private void on() {
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    //睡觉一键关电器
    private void off() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
