package demo.designPattern.strategy;

/**
 * 为圣诞准备的促销活动C
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:19
 **/
public class StrategyC implements AbstractStrategy{
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
