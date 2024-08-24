package demo.designPattern.factory.method;

import demo.designPattern.factory._coffee.AmericanCoffee;
import demo.designPattern.factory._coffee.Coffee;

/**
 * 美式咖啡工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:38
 **/
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee create() {
        return new AmericanCoffee();
    }
}
