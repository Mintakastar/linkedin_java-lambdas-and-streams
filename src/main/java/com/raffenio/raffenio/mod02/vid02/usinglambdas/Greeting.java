package com.raffenio.raffenio.mod02.vid02.usinglambdas;


@FunctionalInterface //only one method can be added in the interface
public interface Greeting {

    void sayHello();

    //if uncommented, throws and error because Functional interface only permits 1 method
    //void sayGoodBye();

}
