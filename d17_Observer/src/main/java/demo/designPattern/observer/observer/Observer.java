package demo.designPattern.observer.observer;

/**
 * 抽象的观察者接口
 */
public interface Observer {
    /**
     * 用于模拟通知观察者
     *
     * @param message 通知信息
     */
    void update(String message);
}
