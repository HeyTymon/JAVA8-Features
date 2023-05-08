import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    public static void main(String[] args) {

        //Example 1
        //Imperative
        int sum1 = 0; //mutable var

        for (int i = 0; i <= 100; i++) {
            sum1 += i;
        }

        //Declerative

        int sum2 = IntStream.rangeClosed(0, 100).sum();


        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        //Example 2

        List<Integer> startList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10, 10);

        //Imperative
        List<Integer> uniqueList1 = new ArrayList<>();

        for (Integer i : startList) {
            if(!uniqueList1.contains(i))
            {
                uniqueList1.add(i);
            }
        }

        System.out.println(uniqueList1);

        //Declarative

        List<Integer> uniqueList2 = startList.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueList2);

    }
}
