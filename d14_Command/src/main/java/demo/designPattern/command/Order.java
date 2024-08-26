package demo.designPattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:28
 **/
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private final Map<String, Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name,num);
    }
}
