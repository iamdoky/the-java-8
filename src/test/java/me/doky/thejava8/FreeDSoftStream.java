package me.doky.thejava8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FreeDSoftStream {

    @Test
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList( 100, 200, 300, 300, 400, 300 );

        Integer maxValue = list.stream()
            .mapToInt( x -> x )
            .max()
            .orElseThrow(NoSuchElementException::new);

        System.out.println(maxValue);
    }
}
