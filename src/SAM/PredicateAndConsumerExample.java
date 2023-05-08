package SAM;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> p3 = (grade, gpa) -> grade >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println("name : " + name + " " + activities);

    Consumer<Student> studentConsumer = student -> {
        if (p3.test(student.getGradeLevel(),student.getGpa())) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printStudent(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printStudent(StudentDataBase.getAllStudents());
    }
}
