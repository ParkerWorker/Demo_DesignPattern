package demo.designPattern.bridge.os;

import demo.designPattern.bridge.file.VideoFile;

/**
 * 操作系统版本的抽象基类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 11:47
 **/
public abstract class AbsOperatingSystem {

    protected VideoFile videoFile;

    public AbsOperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
