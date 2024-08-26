package demo.designPattern.visitor;

import demo.designPattern.visitor.animal.Animal;
import demo.designPattern.visitor.person.AnimalVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 主人的家实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:31
 **/
public class Home {
    private final List<Animal> nodeList = new ArrayList<>();

    public void action(AnimalVisitor person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    //添加操作
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}
