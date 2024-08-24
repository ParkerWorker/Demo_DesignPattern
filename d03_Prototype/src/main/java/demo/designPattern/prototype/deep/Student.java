package demo.designPattern.prototype.deep;

import java.io.Serializable;

/**
 * 学生类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:59
 **/
public class Student implements Serializable {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
