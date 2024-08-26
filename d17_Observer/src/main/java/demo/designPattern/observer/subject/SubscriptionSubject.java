package demo.designPattern.observer.subject;

import demo.designPattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号是具体主题（具体被观察者），里面存储了订阅该公众号的微信用户，并实现了抽象主题中的方法。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:44
 **/
public class SubscriptionSubject implements Subject{

    //储存订阅公众号的微信用户
    private final List<Observer> weixinUserlist = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
