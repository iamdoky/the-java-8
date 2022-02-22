package me.doky.thejava8.complatableFuture;

public class App2 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000L);
            } catch ( InterruptedException e ) {
                e.printStackTrace();
            }
            System.out.println("Hello : " + Thread.currentThread().getName());
        });
        thread.start();

        System.out.println("Hi : " + Thread.currentThread().getName());

/*

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread  :  " + Thread.currentThread().getName());
            }
        });
*/

    }
}
