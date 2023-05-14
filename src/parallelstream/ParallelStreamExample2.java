package parallelstream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    static List<String> sequentialActivitiesList() {
        long startTime = System.currentTimeMillis();
        int value = (int) StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();

        long endTime = System.currentTimeMillis();
        System.out.println("Sequential: " + (endTime-startTime));

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    static List<String> parallelActivitiesList() {

        long startTime = System.currentTimeMillis();
        int value = (int) StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .count();

        long endTime = System.currentTimeMillis();
        System.out.println("Parallel: " + (endTime-startTime));

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sequentialActivitiesList();
        parallelActivitiesList();
    }
}
