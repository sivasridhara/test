//package siva.collection.iterable.list.arraylist;

import java.util.ArrayList;

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


     */

    public static void main(String[] args) {
        // Create an array list.
        ArrayList<String> al = new ArrayList<String>();
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
