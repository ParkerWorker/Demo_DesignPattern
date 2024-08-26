package demo.designPattern.flyweight;

import demo.designPattern.flyweight.shape.AbsShape;
import org.junit.Assert;
import org.junit.Test;

/**
 * 测试俄罗斯方块工厂类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 16:53
 **/
public class ShapeFactoryTest {

    @Test
    public void testGetBox() {
        AbsShape shape0 = ShapeFactory.getInstance().getBox("S");
        AbsShape shape1 = ShapeFactory.getInstance().getBox("S");
        Assert.assertEquals(shape0, shape1);
    }
}
