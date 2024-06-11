package com.raffenio.raffenio.mod03.vid02.using.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] scores= new Integer[]{80,66,73,92,43};

        Stream<Integer> scroesStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shippingListStream = shoppingList.stream();
        shippingListStream
                .sorted()
                .forEach(item-> System.out.println(item));

        Stream<String> letters = Stream.of("a","b","c");




    }
}
