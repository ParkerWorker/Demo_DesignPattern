package demo.localhost.designPattern.adapter;

import demo.localhost.designPattern.SD.SDCard;
import demo.localhost.designPattern.TF.TFCardImpl;

/**
 * 定义使用 类适配器模式 的适配器类（SD兼容TF）
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:28
 **/
public class SDAdapterTF01  extends TFCardImpl implements SDCard {

    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}