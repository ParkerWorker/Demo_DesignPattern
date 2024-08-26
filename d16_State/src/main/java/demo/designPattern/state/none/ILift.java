package demo.designPattern.state.none;

/**
 * 电梯接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:06
 **/
public interface ILift {
    //电梯的4个状态
    //开门状态
    int OPENING_STATE = 1;
    //关门状态
    int CLOSING_STATE = 2;
    //运行状态
    int RUNNING_STATE = 3;
    //停止状态
    int STOPPING_STATE = 4;

    //设置电梯的状态
    void setState(int state);

    //电梯的动作
    void open();
    void close();
    void run();
    void stop();
}
