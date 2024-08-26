package demo.designPattern.command;

/**
 * 资深大厨实体类 是命令的 Receiver
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 17:28
 **/
public class SeniorChef {

    public void makeFood(int num,String foodName) {
        System.out.println(num + "份" + foodName);

        try {
            Thread.sleep(20);//停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
