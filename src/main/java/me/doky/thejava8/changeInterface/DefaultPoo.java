package me.doky.thejava8.changeInterface;

/*public class DefaultPoo implements Poo, Bar {*/
public class DefaultPoo implements Poo{

    String name;

    public DefaultPoo ( String name ) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);

        //TODO: 2022-02-15 : 재정의 가능하다.
        //  Ojbect에서 제공하는 equlas, hashCode 등은 재정의가 불가능하다.
        //  추상메서드 선언은 가능하다.
        //  System.out.println(this.name.toUpperCase());
    }

/*    @Override
    public void printNameUpperCase() {

    }*/

    @Override
    public String getName() {
        return this.name;
    }

}
