package com.raffenio.raffenio.mod02.vid03.usingexistinginterfaces;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        Greeting greeting1 = new HelloGreeting();
        greeting1.sayHello(); //one way to implement the interface


        //this is another way to implement a functional interface
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world again!");
            }
        };

        greeting2.sayHello();

        //another way to implemnt the interface, in this case using lambdas
        Greeting greeting3 = () -> System.out.println("Hello world from lambda");
        greeting3.sayHello();



        Calculator calculator  = (int x, int y)-> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x*y*randomNumber;
        };

        System.out.println(calculator.calculate(1,2));

        IntBinaryOperator calculator2  = (int x, int y)-> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x*y*randomNumber;
        };

        System.out.println(calculator2.applyAsInt(1,2));



    }
}
