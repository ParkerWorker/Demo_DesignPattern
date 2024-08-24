package demo.designPattern.factory.static_;

import demo.designPattern.factory._coffee.Coffee;

/**
 * 使用静态工厂的咖啡店类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:27
 **/
public class StaticFactoryCoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = StaticFactory.createCoffee(type);
        if (coffee == null) {
            return coffee;
        }

        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
