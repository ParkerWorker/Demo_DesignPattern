package demo.designPattern.factory.simple;

import demo.designPattern.factory.none.NoneFactoryCoffeeStore;
import demo.designPattern.factory.simple.SimpleFactoryCoffeeStore;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试使用简单工厂模式的咖啡店
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:22
 **/
public class CoffeeStoreTest {

    private static SimpleFactoryCoffeeStore coffeeStore;

    @BeforeClass
    public static void init() {
        coffeeStore = new SimpleFactoryCoffeeStore();
    }

    @Test
    public void testOrderCoffee() {
        Assert.assertNotNull(coffeeStore.orderCoffee("american"));
        Assert.assertNotNull(coffeeStore.orderCoffee("latte"));
        Assert.assertNull(coffeeStore.orderCoffee("Espresso"));
    }
}
