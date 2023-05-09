package terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroupingBy {

    public static Map<String, List<Student>> genderGrouping() {
        return StudentDataBase.getAllStudents().stream().collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customGrouping() {
        return StudentDataBase.getAllStudents().stream().collect(groupingBy(s -> s.getGpa() > 3.8 ? "Better" : "Worse"));
    }

    public static void main(String[] args) {
        //System.out.println(genderGrouping());
        System.out.println(customGrouping());
    }
}
