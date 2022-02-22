package me.doky.thejava8.complatableFuture.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executors2 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2) ;
        executorService.submit( getRunnable("Hello"));
        executorService.submit( getRunnable("iamdoky"));
        executorService.submit( getRunnable("pspbsj"));
        executorService.submit( getRunnable("little"));
        executorService.submit( getRunnable("wisdom"));

        executorService.shutdown();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //scheduledExecutorService.schedule(getRunnable("Hello"), 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(getRunnable("Hello"), 2,2, TimeUnit.SECONDS);

        //scheduledExecutorService.shutdown();

    }

    private static Runnable getRunnable ( String message ) {
        return () -> {
            System.out.println(message + Thread.currentThread().getName());
        };
    }
}
