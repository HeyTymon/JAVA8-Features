package optional;

import java.util.Optional;

public class OptionalMethodsExample {

    public static Optional<String> ofNullable()
    {
        return Optional.ofNullable("Value");
    }

    public static void main(String[] args) {

        System.out.println(ofNullable());
        System.out.println(ofNullable().get());
    }
}
