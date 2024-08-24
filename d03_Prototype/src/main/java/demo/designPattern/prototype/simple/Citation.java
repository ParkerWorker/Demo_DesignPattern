package demo.designPattern.prototype.simple;

/**
 * 简单的奖状类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:56
 **/
public class Citation implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
