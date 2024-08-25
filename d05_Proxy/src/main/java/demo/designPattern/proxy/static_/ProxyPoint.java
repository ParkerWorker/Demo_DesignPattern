package demo.designPattern.proxy.static_;

/**
 * 火车票的代售点
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 23:38
 **/
public class ProxyPoint implements SellTickets{

    private final TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }
}
