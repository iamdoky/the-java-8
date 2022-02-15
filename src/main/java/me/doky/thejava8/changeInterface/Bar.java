package me.doky.thejava8.changeInterface;

public interface Bar {

    // Poo에 있는 메서드를 재정의하여 사용가능하지만, Bar를 사용하는 곳에서도 다시 재정의를 해주어야 한다.
    default void printNameUpperCase() {
        System.out.println( "BAR" );
    };


}
