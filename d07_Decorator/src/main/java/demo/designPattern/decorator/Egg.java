package demo.designPattern.decorator;

/**
 * 加鸡蛋配料的快餐
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:45
 **/
public class Egg extends AbsGarnish{

    public Egg(AbsFastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
