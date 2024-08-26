package demo.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的容器类，重写所有的方法。
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:08
 **/
public class StudentAggregateImpl implements StudentAggregate{

    private final List<Student> list = new ArrayList<>();  // 学生列表

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
