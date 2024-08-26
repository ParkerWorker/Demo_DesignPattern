package demo.designPattern.template;

/**
 * 抽象类 - 负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:06
 **/
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public final void cookProcess() {
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.heatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    /**
     * 基本方法 1 -  第一步：倒油是一样的，所以直接实现
     */
    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 基本方法 2 -  第二步：热油是一样的，所以直接实现
     */
    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 基本方法 3 - 第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
     */
    public abstract void pourVegetable();

    /**
     * 基本方法 4 - 第四步：倒调味料是不一样
     */
    public abstract void pourSauce();


    /**
     * 基本方法 4 - 第五步：翻炒是一样的，所以直接实现
     */
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
