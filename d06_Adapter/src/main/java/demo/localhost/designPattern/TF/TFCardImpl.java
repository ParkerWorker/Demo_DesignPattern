package demo.localhost.designPattern.TF;

/**
 * TF卡实现类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:27
 **/
public class TFCardImpl implements TFCard {

    public String readTF() {
        return "sd card read a msg :hello word SD";
    }

    public void writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}