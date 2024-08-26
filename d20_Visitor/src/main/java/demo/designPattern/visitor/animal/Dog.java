package demo.designPattern.visitor.animal;

import demo.designPattern.visitor.person.AnimalVisitor;

/**
 * 宠物狗
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:34
 **/
public class Dog implements Animal{
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}
