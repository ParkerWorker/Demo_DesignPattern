package demo.designPattern.bridge.os;

import demo.designPattern.bridge.file.VideoFile;

/**
 * mac 版本操作系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:48
 **/
public class Mac extends AbsOperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("在 Mac 系统内...");
        videoFile.decode(fileName);
    }
}
