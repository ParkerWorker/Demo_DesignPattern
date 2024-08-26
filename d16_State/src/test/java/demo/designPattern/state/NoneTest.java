package demo.designPattern.state;

import demo.designPattern.state.none.ILift;
import demo.designPattern.state.none.LiftImpl;
import org.junit.Test;

/**
 * 测试不使用状态模式的电梯状态系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 21:09
 **/
public class NoneTest {
    @Test
    public void testChange(){
        ILift lift = new LiftImpl();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
