package demo.designPattern.factory.static_;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试使用静态工厂的咖啡店
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:28
 **/
public class CoffeeStoreTest {
    private static StaticFactoryCoffeeStore coffeeStore;

    @BeforeClass
    public static void init() {
        coffeeStore = new StaticFactoryCoffeeStore();
    }

    @Test
    public void testOrderCoffee() {
        Assert.assertNotNull(coffeeStore.orderCoffee("american"));
        Assert.assertNotNull(coffeeStore.orderCoffee("latte"));
        Assert.assertNull(coffeeStore.orderCoffee("Espresso"));
    }
}
