package demo.designPattern.prototype.simple;

/**
 * 测试访问类
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/25 0:57
 **/
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
