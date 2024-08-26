package demo.designPattern.mediator.person;

import demo.designPattern.mediator.AbstractMediator;

/**
 * 抽象同事类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:56
 **/
public class AbstractPerson {
    protected String name;
    protected AbstractMediator mediator;

    public AbstractPerson(String name,AbstractMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
