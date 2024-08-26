package demo.designPattern.facade;

import org.junit.Test;

/**
 * 测试只能音箱 - 门面模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 12:00
 **/
public class FacadeTest {

    @Test
    public void testOperate(){
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
