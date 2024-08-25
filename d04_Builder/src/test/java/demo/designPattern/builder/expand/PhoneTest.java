package demo.designPattern.builder.expand;

import org.junit.Test;

/**
 * 测试使用建造器 重构构造器参数众多
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 19:02
 **/
public class PhoneTest {

    @Test
    public void testCreate() {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();

        System.out.println(phone);
    }
}
