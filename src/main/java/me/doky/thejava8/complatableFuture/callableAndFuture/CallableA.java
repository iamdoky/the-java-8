package me.doky.thejava8.complatableFuture.callableAndFuture;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableA {

    public static void main(String[] args)  throws ExecutionException, InterruptedException {

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(1000L);
            return "java";
        };

        Callable<String> python = () -> {
            Thread.sleep(3000L);
            return "python";
        };

        /*
            List<Future<String>> futures  = executorService.invokeAll(Arrays.asList( hello, java, python) );

            for ( Future<String> f : futures ) {
                System.out.println(f.get());
            }
        */

        String s  = executorService.invokeAny(Arrays.asList( hello, java, python) );
        System.out.println(s);

        executorService.shutdown();

    }

}
