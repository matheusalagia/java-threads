package org.example;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {

        // Voce precisa criar um objeto que extende a classe Thread
        Thread myFirstThread = new Thread() {
            // sobreescrever o metodo run() com o codigo que voce deseja executar
            // esse metodo executara concorrentemente ao codigo da thread
            // principal (main)
            @Override
            public void run() {
                System.out.println("Hello world from my first thread in java!");
            }
        };
        myFirstThread.start();
        System.out.println("Hello world from main thread!");
        // aguarda o codigo da thread terminar, ou seja, o codigo do metodo run().
        myFirstThread.join();
    }
}