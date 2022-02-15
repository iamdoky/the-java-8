package me.doky.thejava8.changeInterface;


public class App {

    public static void main(String[] args) {
        Poo poo = new DefaultPoo("doky");
        poo.printName();
        poo.printNameUpperCase();

        Poo.printAnything();
    }

}
