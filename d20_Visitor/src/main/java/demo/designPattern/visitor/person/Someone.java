package demo.designPattern.visitor.person;

import demo.designPattern.visitor.animal.Cat;
import demo.designPattern.visitor.animal.Dog;

/**
 * 某人实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:35
 **/
public class Someone implements AnimalVisitor{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
