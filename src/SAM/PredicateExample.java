package SAM;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = i -> i % 2 == 0;
    static Predicate<Integer> p2 = i -> i % 5 == 0;

    public static void predicateAnd(Integer a) {
        System.out.println(p1.and(p2).test(a));
    }

    public static void predicateOr(Integer a) {
        System.out.println(p1.or(p2).test(a));
    }

    public static void predicateNegate(Integer a){
        System.out.println(p1.negate().test(a));
    }

    public static void main(String[] args) {

        System.out.println(p1.test(1));
        predicateAnd(10); //true
        predicateOr(8); //true
        predicateOr(2);//false
    }
}
