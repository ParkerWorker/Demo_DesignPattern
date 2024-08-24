package demo.designPattern.factory._coffee;

/**
 * 拿铁咖啡
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:09
 **/
public class LatteCoffee implements Coffee{
    @Override
    public String getName() {
        return "Latte Coffee";
    }

    @Override
    public void addMike() {
        System.out.println("Adding milk to Latte coffee.");
    }

    @Override
    public void addSugar() {
        System.out.println("Adding sugar to Latte coffee.");
    }
}
