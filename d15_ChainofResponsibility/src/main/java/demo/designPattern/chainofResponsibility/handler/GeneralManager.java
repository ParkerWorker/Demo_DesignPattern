package demo.designPattern.chainofResponsibility.handler;

import demo.designPattern.chainofResponsibility.LeaveRequest;

/**
 * 总经理实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 20:58
 **/
public class GeneralManager extends AbstractHandler {

    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(AbstractHandler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
