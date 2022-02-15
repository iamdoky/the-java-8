package me.doky.thejava8.java8API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("iamdoky");
        name.add("littleMargarine");
        name.add("bsbpsj");
        name.add("wisdom");

        // iterable
        name.forEach( (s) -> {
            System.out.println(s);
        });

        System.out.println("================================");

        name.forEach(System.out::println);

        System.out.println("================================");

        for ( String n : name ) {
            System.out.println(n);
        }

        System.out.println("================================");

        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        while ( spliterator.tryAdvance(System.out::println) );

        System.out.println("================================");

        while ( spliterator1.tryAdvance(System.out::println) );

        System.out.println("================================");

        // Stream
        long k = name.stream().map(String::toUpperCase)
                .filter( s-> s.startsWith("i"))
                .count();
        System.out.println(k);

        System.out.println("----------------------------------");

        name.removeIf( s -> s.startsWith("i"));
        name.forEach(System.out::println);

        System.out.println("----------------------------------");

        name.sort(String::compareToIgnoreCase);
        name.forEach(System.out::println);

        System.out.println("####################################");

        Comparator<String> comparator = String::compareToIgnoreCase;
        name.sort(comparator.reversed());
        // name.sort(comparator.reversed().thenComparing());
        name.forEach(System.out::println);


    }

}
