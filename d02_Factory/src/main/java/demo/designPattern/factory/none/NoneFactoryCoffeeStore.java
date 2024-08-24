package demo.designPattern.factory.none;

import demo.designPattern.factory._coffee.AmericanCoffee;
import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._coffee.LatteCoffee;

/**
 * 不使用工厂模式的咖啡店类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:11
 **/
public class NoneFactoryCoffeeStore {

    /**
     * 生成咖啡订单
     * @param type 咖啡种类
     * @return 返回咖啡类
     */
    public Coffee orderCoffee(String type) {
        Coffee coffee;
        if ("american".equalsIgnoreCase(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equalsIgnoreCase(type)) {
            coffee = new LatteCoffee();
        } else {
            return null;
        }

        //添加配料
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
