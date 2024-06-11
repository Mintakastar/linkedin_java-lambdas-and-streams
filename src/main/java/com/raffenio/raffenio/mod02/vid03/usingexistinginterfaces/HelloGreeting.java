package com.raffenio.raffenio.mod02.vid03.usingexistinginterfaces;

public class HelloGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
