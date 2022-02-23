package me.doky.thejava8.complatableFuture.callableAndFuture;

import java.util.concurrent.*;

public class CallableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());
        System.out.println("Started!");

        // helloFuture.get();
        helloFuture.cancel(false);

        System.out.println(helloFuture.isDone());
        System.out.println("End!");
        executorService.shutdown();


    }

}
