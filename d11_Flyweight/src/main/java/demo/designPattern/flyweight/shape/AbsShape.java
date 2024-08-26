package demo.designPattern.flyweight.shape;

/**
 * 所有俄罗斯方块中所有形状方块的抽象基类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 16:41
 **/
public abstract class AbsShape {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
