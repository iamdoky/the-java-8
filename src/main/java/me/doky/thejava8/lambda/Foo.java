package me.doky.thejava8.lambda;


import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

        // Function 하나의 값을 받아 하나의 값을 리턴.
        //Plus10 plus10 = new Plus10();
        //System.out.println(plus10.apply(1));
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multply2 = (i) -> i * 2;
        Function<Integer, Integer> multiplt2AndPlus10 = plus10.compose(multply2);

        //System.out.println(plus10.apply(5));
        //System.out.println(multply2.apply(2));
        //System.out.println( multiplt2AndPlus10.apply(5));
        //System.out.println(plus10.andThen(multply2).apply(6));

        // BiFunction 입력값을 2개 받아 T,U 를 조합하여 I 로 리턴한다.

        // Cocnsumer 입력값을 받아 리턴을 하지 않는다.
        Consumer<Integer> printT = (i) -> System.out.println(i);
        //printT.accept(10);

        // Supplier<T> 어떠한 값을 가져올때 사용한다. 매개변수가 없고 받아올 타입을 정의한다.
        Supplier<Integer> get11 = () -> 11;
        //System.out.println(get11);

        // Predicate 어떠한 인자를 받아 boolean 을 리턴하는
        Predicate<String> startsWithDoky = (s) -> s.startsWith("doky");
        Predicate<Integer> isIdd = (i) -> i%2 == 0;

        //System.out.println(startsWithDoky.or("doky"));

        // UnaryOperator -> Function 함수의 특수한 케이스
        //UnaryOperator<Integer, Integer> plusA10 = (i) -> i + 10;
        //UnaryOperatorn<Integer, Integer> multplyA2 = (i) -> i * 2;


        /*RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
                System.out.println("Lmbda");
            }
        }*/

        // 람다식 표현
        // 변수에 할당하고 메소드 파라미터 또는 리턴타입으로 리턴할 수 있다. 함수형 Fisrt class object 로 사용가능하다.
        /*
        RunSomething runSomething1 = () -> System.out.println("Hello");
        RunSomething runSomething2 = () -> {
            System.out.println("Hello");
            System.out.println("Labmda");
        };
        */
        //runSomething2.doIt();

        RunSomething runSomething = (number) -> {
            return number + 10;
        };

        /*
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));

        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(2));*/

    }
}
