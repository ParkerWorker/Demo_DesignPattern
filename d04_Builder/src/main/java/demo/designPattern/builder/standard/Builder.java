package demo.designPattern.builder.standard;

/**
 * 抽象 builder 类 - 实现复杂对象的那些部分的创建，并不涉及具体的部件对象的创建
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 18:46
 **/
public abstract class Builder {

    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
