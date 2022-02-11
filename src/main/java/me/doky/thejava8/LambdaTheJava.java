package me.doky.thejava8;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
public class LambdaTheJava {

    public static void main(String[] args) {
        //Supplier<Integer> get10 = () -> 10;
        //BinaryOperator<Integer> sum = (a,b) -> a + b;

        LambdaTheJava lambdaTheJava = new LambdaTheJava();
        lambdaTheJava.run();

    }

    private void run() {
        // final 생략 가능한 경우 -> 뒤에 값이 변경 하지 못하는 경우!
        final int baseNumber = 10;      // 로컬변수

        // 로컬 클래스
       class LocalClass {
            void printBaseNumber() {
                int baseNumber = 110;
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            };
        };

        // 람다
        IntConsumer printInt = (i) -> System.out.println( i + baseNumber );
        printInt.accept(10);
    }
}
