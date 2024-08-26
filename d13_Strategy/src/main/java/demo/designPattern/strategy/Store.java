package demo.designPattern.strategy;

/**
 * 模拟商店举行促销活动
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:19
 **/
public class Store {
    //持有抽象策略角色的引用
    private AbstractStrategy strategy;

    public Store() {
    }

    public AbstractStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void saleShow(){
        strategy.show();
    }
}
