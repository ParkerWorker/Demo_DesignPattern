package demo.designPattern.factory.none;

import demo.designPattern.factory.none.NoneFactoryCoffeeStore;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试不使用工厂模式的咖啡店
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:13
 **/
public class CoffeeStoreTest {

    private static NoneFactoryCoffeeStore coffeeStore;

    @BeforeClass
    public static void init() {
        coffeeStore = new NoneFactoryCoffeeStore();
    }

    @Test
    public void testOrderCoffee() {
        Assert.assertNotNull(coffeeStore.orderCoffee("american"));
        Assert.assertNotNull(coffeeStore.orderCoffee("latte"));
        Assert.assertNull(coffeeStore.orderCoffee("Espresso"));
    }
}
