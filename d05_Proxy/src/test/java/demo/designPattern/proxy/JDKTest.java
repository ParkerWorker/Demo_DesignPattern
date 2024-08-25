package demo.designPattern.proxy;

import demo.designPattern.proxy.JDK.ProxyFactory;
import demo.designPattern.proxy.JDK.SellTickets;
import org.junit.Test;

/**
 * JDK 动态代理测试
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 23:43
 **/
public class JDKTest {

    @Test
    public void testSell(){
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
