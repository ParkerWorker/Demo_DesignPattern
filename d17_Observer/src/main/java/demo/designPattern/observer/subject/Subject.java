package demo.designPattern.observer.subject;

import demo.designPattern.observer.observer.Observer;

/**
 * 定义抽象主题类，提供了 attach、detach、notify 三个方法
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:43
 **/
public interface Subject {

    /**
     * 增加订阅者
     *
     * @param observer 新增的订阅者
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer 已经存在的订阅者
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     *
     * @param message 通知订阅者的信息
     */
    void notify(String message);
}
