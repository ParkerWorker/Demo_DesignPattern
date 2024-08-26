package demo.designPattern.iterator;

/**
 * 学生迭代器抽象接口
 */
public interface StudentIterator {
    boolean hasNext();
    Student next();
}
