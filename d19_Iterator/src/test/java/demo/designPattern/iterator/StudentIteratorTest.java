package demo.designPattern.iterator;

import org.junit.Test;

/**
 * 测试学生迭代器
 *
 * @author 12208
 * @version 1.0
 * @since 2024/8/26 22:09
 **/
public class StudentIteratorTest {
    @Test
    public void test() {
        StudentAggregate studentAggregate = new StudentAggregateImpl();

        studentAggregate.addStudent(new Student("学生 1", 11));
        studentAggregate.addStudent(new Student("学生 2", 12));
        studentAggregate.addStudent(new Student("学生 3", 11));

        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
