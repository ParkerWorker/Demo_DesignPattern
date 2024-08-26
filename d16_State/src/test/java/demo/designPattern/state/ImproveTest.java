package demo.designPattern.state;

import demo.designPattern.state.improve.ClosingState;
import demo.designPattern.state.improve.Context;
import org.junit.Test;

/**
 * 测试应用状态模式的电梯状态转换系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:31
 **/
public class ImproveTest {
    @Test
    public void test(){
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
