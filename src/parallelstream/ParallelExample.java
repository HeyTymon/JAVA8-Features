package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelExample {

    public static long checkPerformance(Supplier<Integer> supplier, int numberOfTimes)
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static int sequentialStreamSum()
    {
        return IntStream.range(0,100000).sum();
    }

    public static int parallelStreamSum()
    {
        return IntStream.range(0,100000).parallel().sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential: " + checkPerformance(ParallelExample::sequentialStreamSum,100));
        System.out.println("Parallel: " + checkPerformance(ParallelExample::parallelStreamSum,100));

    }
}
