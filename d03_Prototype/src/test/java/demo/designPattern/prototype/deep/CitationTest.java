package demo.designPattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深克隆测试类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 1:02
 **/
public class CitationTest {

    public static void main(String[] args) throws Exception {
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //写入字节数组
        ByteArrayOutputStream aos = new ByteArrayOutputStream();
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(aos);
        //将c1对象写出到文件中
        oos.writeObject(c1);
        byte[] array = aos.toByteArray();
        oos.close();

        //读取字节数组
        ByteArrayInputStream ais = new ByteArrayInputStream(array);
        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(ais);
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}
