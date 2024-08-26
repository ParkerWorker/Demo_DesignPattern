package demo.designPattern.chainofResponsibility;

import demo.designPattern.chainofResponsibility.handler.GeneralManager;
import demo.designPattern.chainofResponsibility.handler.GroupLeader;
import demo.designPattern.chainofResponsibility.handler.Manager;
import org.junit.Test;

/**
 * 测试应用责任链模式的请假系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 20:58
 **/
public class LeaveRequestTest {

    @Test
    public void test(){
        //请假条来一张
        LeaveRequest leave = new LeaveRequest("小花",5,"身体不适");

        //各位领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);//小组长的领导是部门经理
        manager.setNextHandler(generalManager);//部门经理的领导是总经理
        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。

        //提交申请
        groupLeader.submit(leave);
    }
}
