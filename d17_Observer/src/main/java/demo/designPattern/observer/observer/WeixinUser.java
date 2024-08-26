package demo.designPattern.observer.observer;

/**
 * 具体观察者类，微信用户是观察者，里面实现了更新的方法。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:41
 **/
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
