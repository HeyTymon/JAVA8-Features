package terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamSummingExample {

    public static int summingNoteBooks() {
        return StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNotebooks));
    }

    public static double avg() {
        return StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNotebooks));
    }

    public static void main(String[] args) {
        System.out.println(summingNoteBooks());
        System.out.println(avg());
    }
}
