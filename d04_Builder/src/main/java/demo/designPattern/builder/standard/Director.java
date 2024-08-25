package demo.designPattern.builder.standard;

/**
 * 指挥者类 - 用于创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 18:48
 **/
public class Director {

    private final Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
