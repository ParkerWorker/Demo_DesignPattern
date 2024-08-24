package demo.designPattern.factory.method;

import demo.designPattern.factory._coffee.Coffee;

/**
 * 咖啡工厂基础接口
 */
public interface CoffeeFactory {
    Coffee create();
}
