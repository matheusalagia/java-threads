package org.example;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

        /* equivalente a:
          Runnable runnable = new Runnable() {
                      @Override
                      public void run() {
                          System.out.println("Hello world using runnable!");
                      }
                  };
         */
        Runnable runnable = () -> System.out.println("Hello world using runnable!");
        Thread t = new Thread(runnable);
        t.start();
        System.out.println("Hello world from main thread!");
        t.join();
    }
}