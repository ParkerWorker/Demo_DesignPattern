package demo.designPattern.factory._coffee;

/**
 * 咖啡基本接口
 */
public interface Coffee {
    /**
     * 模拟获取咖啡名称
     */
    String getName();

    /**
     * 为咖啡加牛奶
     */
    void addMike();

    /**
     * 为咖啡加方糖
     */
    void addSugar();
}
