package demo.designPattern.builder.statndard;

import demo.designPattern.builder.standard.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 测试标准的建造者，创建 bike 实体
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 18:51
 **/
public class BikeTest {

    private static Builder[] builders;

    @BeforeClass
    public static void init() {
        builders = new Builder[]{new MobikeBuilder(), new OfoBuilder()};
    }

    @Test
    public void testCreate() {
        for (Builder builder : builders) {
            Director director = new Director(builder);
            Bike bike = director.construct();
            System.out.println(builder);
            System.out.println(bike.getFrame());
            System.out.println(bike.getSeat());
            System.out.println();
        }
    }
}
