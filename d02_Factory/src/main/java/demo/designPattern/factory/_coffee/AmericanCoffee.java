package demo.designPattern.factory._coffee;

/**
 * 美式咖啡
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/24 23:07
 **/
public class AmericanCoffee implements Coffee{
    @Override
    public String getName() {
        return "American Coffee";
    }

    @Override
    public void addMike() {
        System.out.println("Adding milk to American coffee.");
    }

    @Override
    public void addSugar() {
        System.out.println("Adding sugar to American coffee.");
    }
}
