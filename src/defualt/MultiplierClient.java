package defualt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        MultiplierClass multiplierClass = new MultiplierClass();

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        List<Integer> integerList2 = new ArrayList<>();

        System.out.println(multiplierClass.multiply(integerList));
        System.out.println(multiplierClass.size(integerList));
        System.out.println(Multiplier.isEmpty(integerList));
        System.out.println(Multiplier.isEmpty(integerList2));
    }
}
