package demo.designPattern.template;

import org.junit.Test;

/**
 * 测试模版方法模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:10
 **/
public class CookTest {
    @Test
    public void test(){
        //炒手撕包菜
        AbstractClass baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        AbstractClass caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
