package demo.designPattern.decorator;

import org.junit.Test;

/**
 * 测试快餐
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:50
 **/
public class FastFoodTest {

    @Test
    public void testOrder(){
        //点一份炒饭
        AbsFastFood food = new FriedRice();
        //花费的价格
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("========");
        //点一份加鸡蛋的炒饭
        AbsFastFood food1 = new FriedRice();
        food1 = new Egg(food1);
        //花费的价格
        System.out.println(food1.getDesc() + " " + food1.cost() + "元");

        System.out.println("========");
        //点一份加培根的炒面
        AbsFastFood food2 = new FriedNoodles();
        food2 = new Bacon(food2);
        //花费的价格
        System.out.println(food2.getDesc() + " " + food2.cost() + "元");
    }
}
