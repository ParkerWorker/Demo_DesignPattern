package demo.designPattern.command;

import java.util.Set;

/**
 * 订单命令类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:28
 **/
public class OrderCommand implements Command{
    //持有接受者对象
    private final SeniorChef receiver;
    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order){
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");

        Set<String> keys = order.getFoodDic().keySet();
        for (String key : keys) {
            receiver.makeFood(order.getFoodDic().get(key),key);
        }

        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}
