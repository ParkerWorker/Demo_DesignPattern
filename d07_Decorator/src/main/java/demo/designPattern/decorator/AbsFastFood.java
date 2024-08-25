package demo.designPattern.decorator;

/**
 * 快餐的抽象基类接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:41
 **/
public abstract class AbsFastFood {
    private float price;
    private String desc;

    public AbsFastFood() {
    }

    public AbsFastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();  //获取价格
}
