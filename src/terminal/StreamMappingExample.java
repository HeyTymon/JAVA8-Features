package terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamMappingExample {

    public static void main(String[] args) {
        List<String> studentNameList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toList()));

        studentNameList.forEach(System.out::println);
    }
}
