package com.udemy.defaults;

public class Client12 implements Interface1, Interface4{

    @Override
    public void methodA() {
        System.out.println("Inside MethodA "+ Client12.class);
    }
}
