package demo.designPattern.visitor.animal;

import demo.designPattern.visitor.person.AnimalVisitor;

/**
 * 动物的基础接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:31
 **/
public interface Animal {

    void accept(AnimalVisitor visitor);
}
