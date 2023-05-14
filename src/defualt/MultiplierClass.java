package defualt;

import java.util.Arrays;
import java.util.List;

public class MultiplierClass implements Multiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (i1, i2) -> i1 * i2);
    }

}
