package me.doky.thejava8;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FreeDSoftExample {

    @Test
    public static void main(String[] args) {
        // List 목록
        List<Integer> list = Arrays.asList( 100, 200, 300, 300, 400, 300 );

        // Set 활용
        Set<Integer> set = new HashSet<Integer>( list );

        for ( Integer str : set ) {
            // System.out.println(str + " : " + Collections.frequency(list, str));
        }

        // Map 활용
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
            // System.out.println( key+ " : " + map.get(key) );
        }

        // String maxKey = Collections.max(map.keySet());
        Integer maxValue = Collections.max( map.values() );

        // Comparator 정의
        Comparator<Map.Entry<Integer, Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e1.getValue().compareTo( e2.getValue() );
            }
        };

        // Max Value의 key, value
        Map.Entry<Integer, Integer> maxEntry = Collections.max( map.entrySet(), comparator );
        // Min Value의 key, value
        Map.Entry<Integer, Integer> minEntry = Collections.min( map.entrySet(), comparator );

        // 결과 출력
        // System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());
        System.out.println( "최종결과 : " + maxEntry.getKey() );


    }

}
