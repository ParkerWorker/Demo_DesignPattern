package demo.designPattern.factory.abstract_;

import demo.designPattern.factory._coffee.AmericanCoffee;
import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._dessert.Dessert;
import demo.designPattern.factory._dessert.MatchaMousse;

/**
 * 美式甜点工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:59
 **/
public class AmericanFactory implements AbstractFactory {
    private AmericanFactory() {
    }

    public static AbstractFactory getInstance() {
        return AmericanFactoryHandle.INSTANCE;
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }

    private static class AmericanFactoryHandle {
        public static final AmericanFactory INSTANCE = new AmericanFactory();
    }
}
