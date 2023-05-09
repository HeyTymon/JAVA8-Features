package streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryExample {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("Adam","Tymon","Hela");
        stringStream.forEach(System.out::println);

        Stream.iterate(1,x -> x * 2).limit(10).forEach(System.out::println);

        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);

    }
}
