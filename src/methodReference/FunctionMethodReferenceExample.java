package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseFunction = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseFunction.apply("java"));
    }
}
