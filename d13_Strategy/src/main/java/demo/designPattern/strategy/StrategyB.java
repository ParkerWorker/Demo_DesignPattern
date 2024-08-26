package demo.designPattern.strategy;

/**
 * 为中秋准备的促销活动B
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:18
 **/
public class StrategyB implements AbstractStrategy{
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
