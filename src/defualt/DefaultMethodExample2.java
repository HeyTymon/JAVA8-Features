package defualt;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    static Consumer<Student> studentConsumer = s -> System.out.println(s);

    public static void sortByName(List<Student> studentList)
    {
        Comparator<Student> comparator = Comparator.comparing(Student::getName);

        studentList.sort(comparator);
    }

    public static void sortByGpaReverse(List<Student> studentList)
    {
        Comparator<Student> comparator = Comparator.comparingDouble(Student::getGpa);

        studentList.sort(comparator.reversed());
    }

    public static void sortWithNullValues(List<Student> studentList)
    {
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();

        sortWithNullValues(studentList);

        //sortByName(studentList);

        studentList.forEach(studentConsumer);

        //sortByGpaReverse(studentList);

        //studentList.forEach(studentConsumer);

    }
}
