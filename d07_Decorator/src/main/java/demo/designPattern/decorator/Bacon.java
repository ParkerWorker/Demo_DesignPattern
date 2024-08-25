package demo.designPattern.decorator;

/**
 * 加培根配料的快餐
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:47
 **/
public class Bacon extends AbsGarnish{

    public Bacon(AbsFastFood fastFood) {
        super(fastFood,2,"培根");
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
