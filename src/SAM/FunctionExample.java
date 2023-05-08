package SAM;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = string -> string.toUpperCase();
    static Function<String,String> concateFunction = string -> string.concat("default");

    public static void main(String[] args) {
        System.out.println(function.andThen(concateFunction).apply("java"));
        System.out.println(function.compose(concateFunction).apply("java"));
    }
}
