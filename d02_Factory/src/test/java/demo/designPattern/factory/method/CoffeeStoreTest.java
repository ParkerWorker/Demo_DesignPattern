package demo.designPattern.factory.method;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试使用工厂方法的咖啡店
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:41
 **/
public class CoffeeStoreTest {

    private static CoffeeFactory[] coffeeFactories;

    @BeforeClass
    public static void init() {
        coffeeFactories = new CoffeeFactory[]{new AmericanCoffeeFactory(), new LatteCoffeeFactory()};
    }

    @Test
    public void testAmericanCoffeeOrder() {
        // 可以使用配置文件来初始化咖啡的工厂类实体
        for (CoffeeFactory coffeeFactory :
                coffeeFactories) {
            FactoryMethodCoffeeStore coffeeStore = new FactoryMethodCoffeeStore(coffeeFactory);
            Assert.assertNotNull(coffeeStore.orderCoffee());
        }
    }
}
