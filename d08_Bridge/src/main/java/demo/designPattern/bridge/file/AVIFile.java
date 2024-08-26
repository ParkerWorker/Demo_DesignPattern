package demo.designPattern.bridge.file;

/**
 * avi文件
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:46
 **/
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
