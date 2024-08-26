package demo.designPattern.mediator.person;

import demo.designPattern.mediator.AbstractMediator;

/**
 * 具体同事类 房屋拥有者
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:57
 **/
public class HouseOwner extends AbstractPerson{

    public HouseOwner(String name, AbstractMediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void constact(String message){
        mediator.constact(message, this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name +"获取到的信息：" + message);
    }
}
