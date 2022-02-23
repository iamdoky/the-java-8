package me.doky.thejava8.complatableFuture.callableAndFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App2 {

    public static void main(String[] args)  throws ExecutionException, InterruptedException{

        CompletableFuture<String> hi =  CompletableFuture.supplyAsync(() -> {
            System.out.println("hi" + Thread.currentThread().getName());
            return "Hi";
        });

        CompletableFuture<String> future = hi.thenCompose(App2::getHi);

        System.out.println(future.get());

    }

    private static CompletableFuture<String> getHi( String message ) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("hi" + Thread.currentThread().getName());
            return message + "Bye";
        });
    }
}
