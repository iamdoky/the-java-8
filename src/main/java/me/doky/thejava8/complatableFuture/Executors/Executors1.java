package me.doky.thejava8.complatableFuture.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor() ;
        //ScheduledExecutorService se =
        executorService.submit( () -> System.out.println("Thread:" + Thread.currentThread().getName()) );

        //executorService.shutdownNow();
        executorService.shutdown();


    }
}
