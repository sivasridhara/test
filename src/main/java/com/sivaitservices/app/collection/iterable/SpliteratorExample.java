
package com.sivaitservices.app.collection.iterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class SpliteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Spliterator<String> spliterator = list.spliterator();
        Spliterator<String> spliterator2 = spliterator.trySplit();

System.out.println(spliterator2.estimateSize());
System.out.println(spliterator2.getExactSizeIfKnown());
System.out.println(spliterator2.hasCharacteristics(spliterator2.characteristics()));

        //Spliterator<String> spliterator2 = spliterator.trySplit();

        spliterator.forEachRemaining(System.out::println);
        System.out.println("@@================");
        spliterator2.forEachRemaining(System.out::println);

        /*SortedSet<String> set = new TreeSet<>( Collections.reverseOrder() );

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);*/

        System.out.println("====================== try advance");

        Spliterator<String> spliterator3 = list.spliterator();

        while(spliterator3.tryAdvance(System.out::println));


        
    }
}
