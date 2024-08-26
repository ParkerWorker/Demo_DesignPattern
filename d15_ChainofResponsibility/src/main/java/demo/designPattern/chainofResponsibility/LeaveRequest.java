package demo.designPattern.chainofResponsibility;

/**
 * 请假条实体类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 20:43
 **/
public class LeaveRequest {
    private final String name;//姓名
    private final int num;//请假天数
    private final String content;//请假内容

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
