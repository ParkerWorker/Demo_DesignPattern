package demo.localhost.designPattern.SD;

/**
 * SD卡实现类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:25
 **/
public class SDCardImpl implements SDCard {
    public String readSD() {
        return "sd card read a msg :hello word SD";
    }

    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
