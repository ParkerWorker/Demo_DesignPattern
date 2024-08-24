package demo.designPattern.factory.abstarct_;

import demo.designPattern.factory.abstract_.AbstractFactory;
import demo.designPattern.factory.abstract_.AbstractFactoryCoffeeStore;
import demo.designPattern.factory.abstract_.AmericanFactory;
import demo.designPattern.factory.abstract_.ItalyFactory;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试抽象工厂模式的咖啡店
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:20
 **/
public class CoffeeStoreTest {
    private static AbstractFactory[] factories;

    @BeforeClass
    public static void init() {
        factories = new AbstractFactory[]{AmericanFactory.getInstance(), ItalyFactory.getInstance()};
    }

    @Test
    public void orderTest() {
        for (AbstractFactory factory :
                factories) {
            AbstractFactoryCoffeeStore coffeeStore = new AbstractFactoryCoffeeStore(factory);
            coffeeStore.order(true, true);
        }
    }
}
