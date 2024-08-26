package demo.designPattern.mediator;

import demo.designPattern.mediator.person.AbstractPerson;

/**
 * 抽象中介者
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:55
 **/
public abstract class AbstractMediator {

    //申明一个联络方法
    public abstract void constact(String message, AbstractPerson person);
}
