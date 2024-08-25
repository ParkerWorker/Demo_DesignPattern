package demo.designPattern.builder.standard;

/**
 * ofo 单车 Builder 类 - 完成复杂产品的各个部件的具体创建方法。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 18:47
 **/
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }

    @Override
    public String toString() {
        return "ofo 单车创建：";
    }
}
