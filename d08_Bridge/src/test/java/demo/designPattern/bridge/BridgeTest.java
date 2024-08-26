package demo.designPattern.bridge;

import demo.designPattern.bridge.file.AVIFile;
import demo.designPattern.bridge.os.AbsOperatingSystem;
import demo.designPattern.bridge.os.Windows;
import org.junit.Test;

/**
 * 测试桥接模式
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:50
 **/
public class BridgeTest {

    @Test
    public void testPlay(){
        AbsOperatingSystem os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}
