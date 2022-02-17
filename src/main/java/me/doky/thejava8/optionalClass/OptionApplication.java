package me.doky.thejava8.optionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionApplication {

    public static void main(String[] args) {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(2, "spring boot jpa", true));
        springClass.add(new OnlineClass(3, "spring mvc", false));
        springClass.add(new OnlineClass(4, "spring core", false));
        springClass.add(new OnlineClass(5, "rest api development", true));

        Optional<OnlineClass> a = springClass.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        // OnlineClass onlineClass1 = a.get();
        // boolean present1 = a.isPresent();
        // boolean present2 = a.isEmpty();
        // a.ifPresent( oc ->  System.out.println(oc.getTitle()));
        // OnlineClass onlineClass = a.orElse(createNewClass());    // 이미 만들어진 인스턴스 , 상수 등에 적절
        // OnlineClass onlineClass = a.orElseGet( OptionApplication::createNewClass ); // 동적을 작업해야할때 적절
        // OnlineClass onlineClass = a.orElseThrow( () -> { return new IllegalStateException(); };
        // OnlineClass onlineClass = a.orElseThrow( IllegalStateException::new );
        // System.out.println(onlineClass.getTitle());
        // Optional<OnlineClass> onlineClass = a.filter( oc -> !oc.isClosed());
        // System.out.println(onlineClass.isPresent());
        // Optional<Integer> integer = a.map(OnlineClass::getId);
        // System.out.println(integer.isPresent());

        // Optional<Optional<Progress>> b =  a.map(OnlineClass::getProgress);
        // Optional<Progress> c = b.orElseThrow();
        // c.orElseThrow();

        Optional<Progress> b = a.flatMap( OnlineClass::getProgress );

        Optional<Optional<Progress>> c = a.map(OnlineClass::getProgress);
        Optional<Progress> d = c.orElse(Optional.empty());
        // Optional<Progress> d = c.orElseThrow();


    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New Test", true);
    }
}
