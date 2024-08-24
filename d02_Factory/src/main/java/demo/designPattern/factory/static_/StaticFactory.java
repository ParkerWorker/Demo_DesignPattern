package demo.designPattern.factory.static_;

import demo.designPattern.factory._coffee.AmericanCoffee;
import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._coffee.LatteCoffee;

/**
 * 静态工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:26
 **/
public class StaticFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
