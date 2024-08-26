package demo.designPattern.mediator;

import demo.designPattern.mediator.person.AbstractPerson;
import demo.designPattern.mediator.person.HouseOwner;
import demo.designPattern.mediator.person.Tenant;

/**
 * 中介机构
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:58
 **/
public class MediatorStructure extends AbstractMediator{
    //首先中介结构必须知道所有房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, AbstractPerson person) {
        if (person == houseOwner) {          //如果是房主，则租房者获得信息
            tenant.getMessage(message);
        } else {       //反之则是房主获得信息
            houseOwner.getMessage(message);
        }
    }
}
