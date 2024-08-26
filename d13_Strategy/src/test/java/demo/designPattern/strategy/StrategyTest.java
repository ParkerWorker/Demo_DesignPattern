package demo.designPattern.strategy;

import org.junit.Test;

/**
 * 促销活动测试
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:21
 **/
public class StrategyTest {
    @Test
    public void testSell(){
        Store store = new Store();

        AbstractStrategy strategyA = new StrategyA();
        store.setStrategy(strategyA);
        store.saleShow();

        AbstractStrategy strategyB = new StrategyB();
        store.setStrategy(strategyB);
        store.saleShow();

        AbstractStrategy strategyC = new StrategyC();
        store.setStrategy(strategyC);
        store.saleShow();
    }
}
