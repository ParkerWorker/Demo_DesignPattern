package demo.designPattern.observer;

import demo.designPattern.observer.observer.Observer;
import demo.designPattern.observer.observer.WeixinUser;
import demo.designPattern.observer.subject.Subject;
import demo.designPattern.observer.subject.SubscriptionSubject;
import org.junit.Test;

/**
 * 测试应用观察者模式的微信公众号系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:46
 **/
public class ObserverTest {
    @Test
    public void testAttach(){
        Subject mSubscriptionSubject=new SubscriptionSubject();
        //创建微信用户
        Observer user1 = new WeixinUser("孙悟空");
        Observer user2 = new WeixinUser("猪悟能");
        Observer user3 = new WeixinUser("沙悟净");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);

        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("微信公众号专栏更新了");
    }
}
