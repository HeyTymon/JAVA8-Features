package defualt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("Tymon","Adam","Hubert","Andrzej","Jakub");

        //Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);

        stringList.sort(Comparator.naturalOrder());

        System.out.println(stringList);

        }
    }

