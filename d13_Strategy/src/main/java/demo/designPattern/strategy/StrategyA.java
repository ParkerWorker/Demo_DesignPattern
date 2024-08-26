package demo.designPattern.strategy;

/**
 * 为春节准备的促销活动 A
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:18
 **/
public class StrategyA implements AbstractStrategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
