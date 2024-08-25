package demo.localhost.designPattern.adapter;

import demo.localhost.designPattern.SD.SDCard;
import demo.localhost.designPattern.TF.TFCard;

/**
 * 定义使用 对象适配器模式 的适配器类（SD兼容TF）
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:29
 **/
public class SDAdapterTF02  implements SDCard {

    private final TFCard tfCard;

    public SDAdapterTF02(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
