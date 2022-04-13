package me.doky.thejava8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TheJava8ApplicationTests {

    @Test
    public static void main(String[] args) {

        // reg = > https://hianna.tistory.com/572
        // reg = > https://hianna.tistory.com/577
        // Colleciotns.frequency() / Set / Map 사용하기

        List<Integer> list = Arrays.asList(100,200,300,300,400,300);

        System.out.println("###############################################################");
        // Set
        Set<Integer> set = new HashSet<Integer>(list);

        for ( Integer str : set ) {
            System.out.println(str + " : " + Collections.frequency(list, str));
        }

        System.out.println("###############################################################");

        // Map
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        for ( Integer str : list ) {
            Integer cnt = map.get( str );
            if ( cnt == null ) {
                map.put( str,1 );
            } else {
                map.put( str, cnt+1 );
            }
        }

        for ( Integer key : map.keySet() ) {
            System.out.println( key+ " : " + map.get(key) );
        }

        // String maxKey = Collections.max(map.keySet());
        Integer maxValue = Collections.max(map.values());

        System.out.println("###############################################################");

        // Comparator 정의
        Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        // Max Value의 key, value
        Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
        // Min Value의 key, value
        Entry<Integer, Integer> minEntry = Collections.min(map.entrySet(), comparator);
        // 결과 출력
        System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());
        System.out.println( "최종결과 : " + maxEntry.getKey() );
        //System.out.println(minEntry.getKey() + " : " + minEntry.getValue());

        System.out.println("###############################################################");

    }
}
