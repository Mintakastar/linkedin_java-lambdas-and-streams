package com.raffenio.raffenio.mod02.vid01.functionalinterface;

public class HelloGreeting implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
