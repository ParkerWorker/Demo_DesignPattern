package demo.designPattern.state.improve;

/**
 * 抽象的电梯状态类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:07
 **/
public abstract class AbstractLiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开门动作
    public abstract void open();

    //电梯关门动作
    public abstract void close();

    //电梯运行动作
    public abstract void run();

    //电梯停止动作
    public abstract void stop();
}
