package demo.designPattern.flyweight.shape;

/**
 * o(O) 形状的方块
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 16:46
 **/
public class OShape extends AbsShape{
    @Override
    public String getShape() {
        return "O";
    }
}
