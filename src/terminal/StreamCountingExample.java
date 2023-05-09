package terminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamCountingExample {

    public static long countTheStudents()
    {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() > 3.5).collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println(countTheStudents());
    }
}
