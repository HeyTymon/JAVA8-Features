package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamMapReduceExample {

    public static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream() //Stream<Students>
                .map(Student::getNotebooks) //Stream<Integer>
                //.reduce(0, (i1, i2) -> i1 + i2); //int
                .reduce(0, Integer::sum);
    }

    public static String longestName() {
        return StudentDataBase.getAllStudents().stream() //Stream<Students>
                .filter(s -> s.getGradeLevel() > 3) //Stream<Students>
                .map(Student::getName) //Stream<String>
                .reduce("", (s1, s2) -> s1.length() > s2.length() ? s1 : s2);
    }

    public static void main(String[] args) {

        System.out.println(noOfNoteBooks());
        System.out.println(longestName());

    }
}
