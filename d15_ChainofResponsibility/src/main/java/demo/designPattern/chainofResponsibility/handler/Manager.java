package demo.designPattern.chainofResponsibility.handler;

import demo.designPattern.chainofResponsibility.LeaveRequest;

/**
 * 部门经理实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 20:57
 **/
public class Manager extends AbstractHandler{
    public Manager() {
        //部门经理处理3-7天的请假
        super(AbstractHandler.NUM_THREE, AbstractHandler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
