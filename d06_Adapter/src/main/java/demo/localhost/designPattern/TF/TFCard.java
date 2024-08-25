package demo.localhost.designPattern.TF;

/**
 * TF卡接口
 */
public interface TFCard {
    /**
     * 读取TF卡方法
     *
     * @return 读取的数据
     */
    String readTF();

    /**
     * 写入TF卡功能
     *
     * @param msg 要写入的数据
     */
    void writeTF(String msg);
}
