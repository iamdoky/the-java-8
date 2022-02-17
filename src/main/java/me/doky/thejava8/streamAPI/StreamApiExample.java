package me.doky.thejava8.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add( new OnlineClass(1, "spring boot", true));
        springClass.add( new OnlineClass(2, "spring boot jpa", false));
        springClass.add( new OnlineClass(3, "spring boot mvcc", true));
        springClass.add( new OnlineClass(4, "spring boot core", false));
        springClass.add( new OnlineClass(5, "rest api development", true));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add( new OnlineClass( 6, "The Java", true ) );
        javaClasses.add( new OnlineClass( 7, "The Java, Code manipulation", true ) );
        javaClasses.add( new OnlineClass( 8, "The Java, 8 to 11", false ) );

        List<List<OnlineClass>> iamdokyEvents = new ArrayList<>();
        iamdokyEvents.add(springClass);
        iamdokyEvents.add(javaClasses);


        System.out.println( "spring 으로 시작하는 수업" );
        // TODO

        System.out.println( "close 되지 않은 수업" );
        // TODO

        System.out.println( "수업 이름만 모아서 스트림" );
        // TODO


        System.out.println( "두 수업 목록에 들어있는 모든 수업 아이디 출력" );
        // TODO

        System.out.println( "10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 뺴고 최대 10개 까지만 " );
        // TODO

        System.out.println( "자바 수업 중에 Test 가 들어 있는 수업이 있는지 확인" );
        // TODO

        System.out.println( "스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기" );
        / TODo

    }

}
