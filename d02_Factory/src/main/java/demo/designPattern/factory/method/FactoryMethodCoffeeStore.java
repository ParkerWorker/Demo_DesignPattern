package demo.designPattern.factory.method;

import demo.designPattern.factory._coffee.Coffee;

/**
 * 使用工厂方法模式的咖啡店类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:36
 **/
public class FactoryMethodCoffeeStore {
    public FactoryMethodCoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    private final CoffeeFactory coffeeFactory;

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.create();
        if (coffee != null) {
            coffee.addMike();
            coffee.addSugar();
        }
        return coffee;
    }
}
