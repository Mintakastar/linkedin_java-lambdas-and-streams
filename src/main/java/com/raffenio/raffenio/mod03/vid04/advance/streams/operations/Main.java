package com.raffenio.raffenio.mod03.vid04.advance.streams.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        Stream<String> letters = Stream.of("a","b","c");

        Stream<String> shippingListStream = shoppingList.stream();
        shippingListStream
                .sorted()
                .map(item->item.toUpperCase())
                .filter(item->item.startsWith("P"))
                .forEach(item-> System.out.println(item));


        /*throws exception, as this stream is already used.*/
        //shippingListStream.forEach(item-> System.out.println(item));

        /*
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //	at java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
        //	at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
        //	at com.raffenio.mod03.vid04.advance.streams.operations.Main.main(Main.java:32)
        */

        System.out.println(shoppingList);


        List<String> sortedShippingList = shoppingList.stream()
                .sorted()
                .map(item->item.toUpperCase())
                .filter(item->item.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(sortedShippingList);

    }
}
