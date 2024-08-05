package com.sivaitservices.app.collection.iterable.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

        /*
         A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element.
         1)  contracts of the add, equals and hashCode methods
         2) set implementations have restrictions on the elements that they may contain. For example, some implementations prohibit null elements
         3)Attempting to add an ineligible element throws an unchecked exception, typically NullPointerException or ClassCastException
         4) attempting an operation on an ineligible element whose completion would not result in the insertion of an ineligible element into the set may throw an exception or it may succeed, at the option of the implementation. Such exceptions are marked as "optional" in the specification for this interface.
         5) An unordered collection in which  duplicates are not allowed. 

         Notes:
         1) A HashSet is a widely used implementation of the Set interface in Java. It's implemented as a hash table, which ensures fast retrieval and storage of elements. The key characteristic of a HashSet is that it does not guarantee the order of elements; they can be stored and retrieved in any sequence.Sep 28, 2023.
         */

    public static void main(String[] args) {
         


         Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        set.add(null);
        set.add(null);

        System.out.println("@@@Set : "+set);
        List<String> list = Arrays.asList(Arrays.toString(set.toArray()));
        //Set to List
        //List<String> list = set.stream().toList();




        System.out.println("@@@list : "+list);

// Java Program Demonstrating Operations on the Set
// such as Union, Intersection and Difference operations 

Set<Integer> a = new HashSet<Integer>();
      
// Adding all elements to List 
a.addAll(Arrays.asList(
    new Integer[] { 1, 3, 2, 4, 0 }));

       // Again declaring object of Set class
      // with reference to HashSet
      Set<Integer> b = new HashSet<Integer>();
        
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 5, 4, 0, 5 }));

           
            // To find union
        Set<Integer> unionOfTwoSets = new HashSet<Integer>(a);
        unionOfTwoSets.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(unionOfTwoSets);

                         // To find intersection
        Set<Integer> intersectionOfTwoSets = new HashSet<Integer>(a);
        intersectionOfTwoSets.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersectionOfTwoSets);

        // To find the symmetric difference
        Set<Integer> differenceOfTwoSets = new HashSet<Integer>(a);
        differenceOfTwoSets.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(differenceOfTwoSets);


    }
    
}
