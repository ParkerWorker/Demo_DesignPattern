package demo.designPattern.decorator;

/**
 * 炒面快餐
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:43
 **/
public class FriedNoodles extends AbsFastFood{

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
