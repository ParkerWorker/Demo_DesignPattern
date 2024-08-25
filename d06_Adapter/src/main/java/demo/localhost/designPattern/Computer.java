package demo.localhost.designPattern;

import demo.localhost.designPattern.SD.SDCard;

/**
 * 电脑类 - 用于模拟读取 SDCard 的功能
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:24
 **/
public class Computer {

    /**
     * 模拟从提供的 SDCard 中读取数据
     *
     * @param sdCard SD卡
     * @return 返回读取的数据
     */
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }

}
