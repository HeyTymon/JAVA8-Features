package parallelstream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelBoxedExample {

    public static int sequentialStream(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream().reduce(0, (x, y) -> x + y);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential: " + (endTime-startTime));
        return sum;
    }

    public static int parallelStream(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream().parallel().reduce(0, (x, y) -> x + y);
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel: " + (endTime-startTime));
        return sum;
    }


    public static void main(String[] args) {

        List<Integer> integerList = IntStream.range(0, 1000).boxed().toList();
        sequentialStream(integerList);
        parallelStream(integerList);
    }
}
