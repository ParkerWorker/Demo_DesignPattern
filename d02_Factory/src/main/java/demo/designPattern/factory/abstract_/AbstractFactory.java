package demo.designPattern.factory.abstract_;

import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._dessert.Dessert;

/**
 * 抽象的工厂类基础接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:53
 **/
public interface AbstractFactory {
    /**
     * 创建咖啡
     * @return 返回咖啡实体
     */
    Coffee createCoffee();

    /**
     * 创建甜点
     * @return 返回甜点实体
     */
    Dessert createDessert();
}
