package demo.designPattern.iterator;

import java.util.List;

/**
 * 具体的迭代器类，重写所有的抽象方法。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:07
 **/
public class StudentIteratorImpl implements StudentIterator{
    private final List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}
