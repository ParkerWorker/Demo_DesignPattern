package demo.designPattern.factory.abstract_;

import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._dessert.Dessert;

/**
 * 使用抽象工厂的咖啡店类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:01
 **/
public class AbstractFactoryCoffeeStore {
    public AbstractFactoryCoffeeStore(AbstractFactory factory) {
        this.factory = factory;
    }

    private final AbstractFactory factory;

    public Order order(boolean hasCoffee, boolean hasDessert) {
        if (factory == null) {
            return null;
        }

        Coffee coffee = null;
        if (hasCoffee) {
            coffee = factory.createCoffee();
            coffee.addMike();
            coffee.addSugar();
        }

        Dessert dessert = null;
        if (hasDessert) {
            dessert = factory.createDessert();
            dessert.show();
        }

        return new Order(coffee, dessert);
    }
}
