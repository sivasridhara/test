package com.sivaitservices.app.collection.iterable.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    /*
        1)Arraylist id equivalent to vector, except that it is un synchronized.
        2) permits all the elements, including null.
        3) ArrayList supports dynamic arrays that can grow as needed. In Java, standard arrays are
            of a fixed length. After arrays are created, they cannot grow or shrink, which means that
            you must know in advance how many elements an array will hold. But, sometimes, you may not
            know until run time precisely how large an array you need. To handle this situation,
            the Collections Framework defines ArrayList. In essence, an ArrayList is a variable-length
            array of object references. That is, an ArrayList can dynamically increase or decrease in size.
            Array lists are created with an initial size. When this size is exceeded,
            the collection is automatically enlarged. When objects are removed, the array can be shrunk.
        4) Arraylist is not synchronized
        5) An ArrayList is a build-in data structure that uses a dynamic array to store its elements.
        6) ArrayList only supports object entries, wrapper classes (Integer, Double, Boolean, Byte).
        not the primitive data types (int, double,boolean, byte )
        7) Object Array in ArrayList is transient. It implements RandomAccess, Cloneable,
         and java.io.Serializable.

        8) What happens if an element is removed from an ArrayList?
        When items are deleted from an ArrayList in Java, the gap produced by the removal of an element
        must be filled in the underlying array using either remove (int I (i.e. using index) or remove (Object o).
        Shifting any following components to the left does this (subtracts one from their indices).
        It is done via the System.arrayCopy method.

        9)  ArrayList is a resizable array implementation. ArrayList expands dynamically, ensuring that there is
        always room for more elements to be added. An array of the Object class serves as the ArrayList's underpinning
         data structure.

         10) The default load factor of 0.75f ensures that the ArrayList always provides the optimal performance in
         terms of both space and time.

        References:
        https://www.javatpoint.com/internal-working-of-arraylist-in-java
     */

    public static void main(String[] args) throws Exception{
        // Create an array list.
        ArrayList<String> al = new ArrayList<String>();

        //converting arraylist to synchronized
        //List<String> al2 = Collections.synchronizedList(new ArrayList<String>());
        al.ensureCapacity(5);
        System.out.println("Initial size of al: " +
                al.size());

         // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " +
                al.size());
        // Display the array list.
        System.out.println("Contents of al: " + al);
        // Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " +
                al.size());
        System.out.println("Contents of al: " + al);



    }


}
