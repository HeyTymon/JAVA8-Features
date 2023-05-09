package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    static int multiplication(List<Integer> integerList) {
        return integerList.stream().reduce(1, (i1, i2) -> i1 * i2);
    }

    static Optional<Student> getHighestGPA() {
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce(((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);

        System.out.println(multiplication(numbers));

        Optional<Student> result = getHighestGPA();
        if (result.isPresent()) {
            System.out.println(result.get());
        }
    }
}
