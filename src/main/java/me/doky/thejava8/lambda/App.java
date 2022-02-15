package me.doky.thejava8.lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        //Function<Integer, String> intToString = (i) -> "number";

        // static 메소드 참조
        UnaryOperator<String> hi1 = (s) -> "hi" + s;
        UnaryOperator<String> hi2 = Greeting::hi;

        // 인스턴스 메소드
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("iamdoky"));

        // 생성자 참조
        Supplier<Greeting> greetingSupplier = Greeting::new;
        greetingSupplier.get();

        // 입력값을 받는 생성자
        Function<String, Greeting> dokyGreeting = Greeting::new;
        Greeting doky = dokyGreeting.apply("littlemargarine");
        System.out.println(doky.getName());

        Supplier<Greeting> newGreeting = Greeting::new;

        //임의 객체의 메소드 참조  - 불특정 다수의 인스터스 메소드 참조
        String[] names = {"iamdoky", "littleMargarine", "bsbpsj"};
        Arrays.sort(names, String::compareToIgnoreCase );
        System.out.println( Arrays.toString(names) );


    }

}
