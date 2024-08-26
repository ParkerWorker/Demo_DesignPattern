package demo.designPattern.visitor.person;

import demo.designPattern.visitor.animal.Cat;
import demo.designPattern.visitor.animal.Dog;

/**
 * 动物访问者基础接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:32
 **/
public interface AnimalVisitor {
    void feed(Cat cat);

    void feed(Dog dog);
}
