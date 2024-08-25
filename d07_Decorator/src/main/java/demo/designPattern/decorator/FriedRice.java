package demo.designPattern.decorator;

/**
 * 炒饭快餐
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:42
 **/
public class FriedRice extends AbsFastFood{

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
