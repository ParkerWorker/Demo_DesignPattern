package demo.designPattern.proxy;

import demo.designPattern.proxy.static_.ProxyPoint;
import org.junit.Test;

/**
 * 静态代理测试
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 23:39
 **/
public class StaticProxy {

    @Test
    public void testSell(){
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}
