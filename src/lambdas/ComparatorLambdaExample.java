package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);

        System.out.println(comparatorLambda.compare(3, 2)); // 3 > 2 -> 1
    }
}
