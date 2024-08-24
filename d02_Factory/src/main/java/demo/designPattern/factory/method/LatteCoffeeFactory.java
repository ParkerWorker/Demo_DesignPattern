package demo.designPattern.factory.method;

import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._coffee.LatteCoffee;

/**
 * 拿铁咖啡工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:39
 **/
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee create() {
        return new LatteCoffee();
    }
}
