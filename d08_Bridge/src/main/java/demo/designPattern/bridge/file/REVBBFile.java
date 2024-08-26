package demo.designPattern.bridge.file;

/**
 * rmvb 文件
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:46
 **/
public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
