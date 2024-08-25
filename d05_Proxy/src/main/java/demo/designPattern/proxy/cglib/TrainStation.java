package demo.designPattern.proxy.cglib;

/**
 * 火车站  火车站具有卖票功能，所以需要实现 SellTickets 接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 23:48
 **/
public class TrainStation {

    public void sell() {
        System.out.println("火车站卖票");
    }
}
