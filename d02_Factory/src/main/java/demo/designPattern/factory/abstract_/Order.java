package demo.designPattern.factory.abstract_;

import demo.designPattern.factory._coffee.Coffee;
import demo.designPattern.factory._dessert.Dessert;

/**
 * 订单实体
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:02
 **/
public class Order {
    private Coffee coffee;
    private Dessert dessert;

    public Order(Coffee coffee, Dessert dessert) {
        this.coffee = coffee;
        this.dessert = dessert;
    }

    public Order() {
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
