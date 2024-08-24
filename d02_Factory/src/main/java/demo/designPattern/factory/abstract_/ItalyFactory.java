package demo.designPattern.factory.abstract_;

import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._coffee.LatteCoffee;
import demo.designPattern.factory._dessert.Dessert;
import demo.designPattern.factory._dessert.Tiramisu;

/**
 * 意大利甜点工厂
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:00
 **/
public class ItalyFactory implements AbstractFactory {
    private ItalyFactory() {

    }

    public static AbstractFactory getInstance() {
        return ItalyFactoryHandle.INSTANCE;
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

    private static class ItalyFactoryHandle {
        public static final ItalyFactory INSTANCE = new ItalyFactory();
    }
}
