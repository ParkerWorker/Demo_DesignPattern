package demo.designPattern.chainofResponsibility.handler;

import demo.designPattern.chainofResponsibility.LeaveRequest;

/**
 * 小组长实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 20:56
 **/
public class GroupLeader extends AbstractHandler{

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(AbstractHandler.NUM_ONE, AbstractHandler.NUM_THREE);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
