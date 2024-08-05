package com.sivaitservices.app.collection.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*The Iterable interface of Collection hierarchy in java is a fundamental interface
in the Java Collections Framework. It serves as the foundation for classes that
represent a group of elements and enables them to be iterated over using an
enhanced for loop or through the use of iterators*/

public class IterableInterfaceExample {
  
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(5,4,1,2,3);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        

        /*Objects of Classes implementing Collection interface can be iterated using for-each loop,
        Collection interface extends Iterable interface*/

        for(int i : list){
           
           // System.out.println(i);
        }


        /*The forEach() method takes the Lambda Expression as a parameter. This Lambda Expression 
        is called for each element of the collection. In the below example, for each element of 
        the list, the function prints the element to the console. */

        list.forEach(e-> {
            //System.out.println(e);
        });

        /*
        We can iterate the elements of Java Iterable by obtaining the Iterator from it using 
        the iterator() method. 

        The methods used while traversing the collections using Iterator to perform the operations are:
        hasNext(): It returns false if we have reached the end of the collection, otherwise returns true.
        next(): Returns the next element in a collection.
        remove(): Removes the last element returned by the iterator from the collection.
        forEachRemaining(): Performs the given action for each remaining element in a collection, in sequential order.
        */
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){

            Integer i = iterator.next();

           
            if(i.equals(1)){
                list.remove(i); //to get concurrant modification exception
                //iterator.remove();
            }
            System.out.println(i);
        }

        //iterator.forEachRemaining(a->System.out.println(a));

        


        // Creating an object of ArrayList class 
        // Declaring object of Integer type 
        ArrayList<Integer> list2 = new ArrayList<>(); 
  
        // Adding custom integer elements to the object 
        list2.add(1); 
        list2.add(2); 
        list2.add(3); 
        list2.add(4); 
        list2.add(5); 
  
        // Iterating over object elements using iterator 
        Iterator<Integer> iterator2 = list2.iterator(); 
  
        // Condition check 
        // It holds true till there is single element 
        // remainin in the List 
        while (iterator2.hasNext()) { 
  
            // Rolling over to next element using next() 
            // method 
            Integer value = iterator2.next(); 
  
            // Print the element value 
            System.out.println("value: " + value); 
  
            // If element equals certain value 
            if (value.equals(2)) { 
  
                // Display command for better readability 
                System.out.println( "========================"); 
  
                // Removing entered value in object 
                System.out.println("removing value: " + value); 
  
                // Making changes simultaneously 
                System.out.println( "========================"); 
                list2.remove(value); 
            } 
        } 



    }

}
