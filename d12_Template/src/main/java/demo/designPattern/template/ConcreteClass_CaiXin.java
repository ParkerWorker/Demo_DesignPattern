package demo.designPattern.template;

/**
 * 炒菜心
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:09
 **/
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
