package demo.localhost.designPattern;

import demo.localhost.designPattern.SD.SDCard;
import demo.localhost.designPattern.SD.SDCardImpl;
import demo.localhost.designPattern.TF.TFCardImpl;
import demo.localhost.designPattern.adapter.SDAdapterTF01;
import demo.localhost.designPattern.adapter.SDAdapterTF02;
import org.junit.Test;

/**
 * 测试计算机读取 SDCard 的功能
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:32
 **/
public class ComputerTest {

    /**
     *  测试类适配器的 TFCard
     */
    @Test
    public void testRead01(){
        System.out.println("测试类适配器的 TFCard");
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF01 adapter = new SDAdapterTF01();
        System.out.println(computer.readSD(adapter));
    }

    @Test
    public void testRead02(){
        System.out.println("测试对象适配器的 TFCard");
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        SDAdapterTF02 adapter = new SDAdapterTF02(new TFCardImpl());
        System.out.println(computer.readSD(adapter));
    }
}
