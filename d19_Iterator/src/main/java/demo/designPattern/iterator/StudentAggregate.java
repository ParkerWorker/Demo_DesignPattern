package demo.designPattern.iterator;

/**
 * 抽象容器类，包含添加元素，删除元素，获取迭代器对象的方法。
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
