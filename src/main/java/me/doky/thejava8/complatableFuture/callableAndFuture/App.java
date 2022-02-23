package me.doky.thejava8.complatableFuture.callableAndFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args)  throws ExecutionException, InterruptedException {

//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Future<String> future = executorService.submit( () -> "hello" );
//        future.get();

//        CompletableFuture<String> future = new CompletableFuture<>();
//        future.complete("doky");

//        CompletableFuture<Void> future = CompletableFuture.runAsync( () -> {
//            System.out.println("hello" + Thread.currentThread().getName());
//        } );
//
//        future.get();
//        CompletableFuture<String> future =  CompletableFuture.supplyAsync(() -> {
//            System.out.println("hello" + Thread.currentThread().getName());
//            return "Heelo";
//        }).thenApply( (s) -> {      // callback
//            System.out.println(Thread.currentThread().getName());
//            return s.toUpperCase();
//        } );

//        CompletableFuture<Void> future =  CompletableFuture.supplyAsync(() -> {
//            System.out.println("hello" + Thread.currentThread().getName());
//            return "Heelo";
//        }).thenAccept( (s) -> {      // callback
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(s.toUpperCase());
//        } );

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> future =  CompletableFuture.supplyAsync(() -> {
            System.out.println("hello" + Thread.currentThread().getName());
            return "Heelo";
        }, executorService).thenRun( () -> {      // callback
            System.out.println(Thread.currentThread().getName());
        } );

        future.get();


    }
}
