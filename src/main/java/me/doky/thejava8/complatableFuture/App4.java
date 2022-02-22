package me.doky.thejava8.complatableFuture;

public class App4 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            System.out.println( "Thread : " + Thread.currentThread().getName());

            try {
                Thread.sleep(3000L);
            } catch ( InterruptedException e ) {
                throw new IllegalStateException(e);
            }
        });

        thread.start();

        System.out.println( "Hello : " + Thread.currentThread().getName());
        thread.join();                                  // join :  쓰레드가 끝날  까지 기다렸다가, 실행한다
        System.out.println(thread + " is finished ");

    }

}
