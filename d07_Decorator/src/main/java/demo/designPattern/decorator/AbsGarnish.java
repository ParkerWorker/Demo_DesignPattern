package demo.designPattern.decorator;

/**
 * 配菜快餐基础抽象类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:44
 **/
public abstract class AbsGarnish extends AbsFastFood{

    private AbsFastFood fastFood;

    public AbsFastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(AbsFastFood fastFood) {
        this.fastFood = fastFood;
    }

    public AbsGarnish(AbsFastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
