package com.raffenio.raffenio.mod02.vid01.functionalinterface;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new HelloGreeting();
        greeting.sayHello(); //one way to implement the interface


        //this is another way to implement a funcitional interface
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world again!");
            }
        };

        greeting2.sayHello();

    }
}
