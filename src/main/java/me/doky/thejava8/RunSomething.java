package me.doky.thejava8;

// 추상메서드가 하나만 있으면 함수형 인터페이스
@FunctionalInterface
public interface RunSomething {

    // abstaract 생략 가능
    //void doIt();
    int doIt(int number) ;

    // public 생략가능
    static void printName() {
        System.out.println("doky");
    }

    default void printAge() {
        System.out.println("31");
    }



}
