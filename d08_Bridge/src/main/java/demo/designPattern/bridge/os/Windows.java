package demo.designPattern.bridge.os;

import demo.designPattern.bridge.file.VideoFile;

/**
 * Windows 版本操作系统
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:47
 **/
public class Windows extends AbsOperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("在 Windows 系统内...");
        videoFile.decode(fileName);
    }
}
