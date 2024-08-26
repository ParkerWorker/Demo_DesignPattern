package demo.designPattern.visitor;

import demo.designPattern.visitor.animal.Cat;
import demo.designPattern.visitor.animal.Dog;
import demo.designPattern.visitor.person.Owner;
import demo.designPattern.visitor.person.Someone;
import org.junit.Test;

/**
 * 测试应用访问者模式的喂养宠物系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:37
 **/
public class FeedTest {
    @Test
    public void test(){
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        Someone someone = new Someone();
        home.action(someone);
    }
}
