package demo.designPattern.mediator;

import demo.designPattern.mediator.person.HouseOwner;
import demo.designPattern.mediator.person.Tenant;
import org.junit.Test;

/**
 * 测试应用中介模式的房屋租赁中介系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:00
 **/
public class MediatorTest {

    @Test
    public void test(){
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这有三室的房子，你需要租吗？");
    }
}
