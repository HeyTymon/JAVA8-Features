package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    static List<String> filteredList()
    {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getName)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(filteredList());
    }
}
