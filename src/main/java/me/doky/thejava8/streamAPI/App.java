package me.doky.thejava8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("iamdoky");
        names.add("littleMargarine");
        names.add("bsbpsj");
        names.add("wisdom");

        // 병렬 처리 parallelStream 사용한다.   -> 데이터 소스 양의 따라 다른데 데이터가 크면 효과가 있을 수도 있어서
        // 잘 확인 해보고 Stream 또는 parallerStream을 쓰자.
        for ( String name: names ) {
            if ( name.startsWith("i") ) {           // i로 시작하는 단어
                System.out.println(name.toUpperCase());
            }
        }

        System.out.println("********************************************************");

        List<String> collect = names.parallelStream().map(String::toUpperCase)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("********************************************************");

        List<String> collects = names.parallelStream().map( (s) -> {
            System.out.println( s + " " + Thread.currentThread().getName() );
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collects.forEach(System.out::println);



        // Stream<String> stringStream = names.stream().map( String::toUpperCase );
/*
        List<String> collect = names.stream().map( (s) -> {
            System.out.println(s);              // 중개 연산자
            return s.toUpperCase();
        }).collect(Collectors.toList());        // 종료 연산자

        System.out.println("=========================");

        collect.forEach(System.out::println);

        System.out.println("=========================");
        names.forEach(System.out::println);*


 */
    }

}
