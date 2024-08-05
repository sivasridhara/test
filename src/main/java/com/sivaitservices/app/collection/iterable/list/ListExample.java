package com.sivaitservices.app.collection.iterable.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListExample {

    /*List interface is an ordered collection (also known as sequence)
    1)The user of this interface has precise control over where in the list each element is inserted.
    2)The user can access elements by their integer index, and search for elements in the list.
    3) list allows duplicate elements, allows multiple null values as elements
    4) The List interface provides four methods for positional (indexed) access to list elements.
    add(int index, E element)
    get(int index)
    remove(int index)
    set(int index, E element)
    5) The List interface provides two methods to efficiently insert and remove multiple elements
     at an arbitrary point in the list.
     6) the equals and hashCode methods are no longer well defined on such a list.
    */ 

    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add(null);
        list.add(null);

        System.out.println(list);

       

        list = new LinkedList<>();
    }

    
}
