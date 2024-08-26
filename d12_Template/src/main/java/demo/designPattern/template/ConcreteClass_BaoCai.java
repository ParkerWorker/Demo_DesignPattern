package demo.designPattern.template;

/**
 * 炒白菜
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:09
 **/
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
