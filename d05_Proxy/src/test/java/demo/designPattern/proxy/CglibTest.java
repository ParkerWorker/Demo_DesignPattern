package demo.designPattern.proxy;

import demo.designPattern.proxy.cglib.ProxyFactory;
import demo.designPattern.proxy.cglib.TrainStation;
import org.junit.Test;

/**
 * cglib 动态代理测试
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 23:50
 **/
public class CglibTest {

    @Test
    public void testProxy(){
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
