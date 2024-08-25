package demo.localhost.designPattern.SD;

/**
 * SD卡的接口
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 0:24
 **/
public interface SDCard {

    /**
     * 读取SD卡方法
     *
     * @return 返回读取的数据
     */
    String readSD();

    /**
     * 写入SD卡功能
     *
     * @param msg 写入的数据
     */
    void writeSD(String msg);
}
