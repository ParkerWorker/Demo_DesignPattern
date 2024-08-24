package demo.designPattern.factory.simple;

import demo.designPattern.factory._coffee.AmericanCoffee;
import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._coffee.LatteCoffee;

/**
 * 简单工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 21:08
 **/
public class SimpleFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
