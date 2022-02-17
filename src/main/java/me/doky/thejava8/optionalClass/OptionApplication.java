package me.doky.thejava8.optionalClass;

import java.util.ArrayList;
import java.util.List;

public class OptionApplication {

    public static void main(String[] args) {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(2, "spring boot jpa", true));
        springClass.add(new OnlineClass(3, "spring mvc", false));
        springClass.add(new OnlineClass(4, "spring core", false));
        springClass.add(new OnlineClass(5, "rest api development", true));

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);


    }
}
