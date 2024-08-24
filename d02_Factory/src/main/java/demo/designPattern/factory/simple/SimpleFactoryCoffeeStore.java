package demo.designPattern.factory.simple;

import demo.designPattern.factory._coffee.Coffee;

/**
 * 使用简单工厂的咖啡店类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:19
 **/
public class SimpleFactoryCoffeeStore {
    public SimpleFactoryCoffeeStore() {
        this.factory = new SimpleFactory();
    }

    private final SimpleFactory factory;

    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee(type);
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
