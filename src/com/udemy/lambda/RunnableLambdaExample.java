package com.udemy.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior java 8
         */
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable prior to java 8");
            }
        };

        new Thread(runnable).start();

        /**
         * java 8 lambds
         * ()->{}
         */
        Runnable lambdaRunnable=()-> System.out.println("runnable java 9 lambda");

        new Thread(lambdaRunnable).start();
        new Thread(()-> System.out.println("inline runnable java 8lambda")).start();


    }
}
