package siva.collection.iterable.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    

    /*
    Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation). 
      
    Summary of Queue methods
    ==================================================
            Throws exception	Returns special value
    ==================================================
    Insert	add(e)	            offer(e)
    Remove	remove()	        poll()
    Examine	element()	        peek()
    ==================================================
    1) Queues typically, but do not necessarily, order elements in a FIFO (first-in-first-out) manner. Among the exceptions are priority queues, which order elements according to a supplied comparator, or the elements' natural ordering, and LIFO queues (or stacks) which order the elements LIFO (last-in-first-out).

    2) Whatever the ordering used, the head of the queue is that element which would be removed by a call to remove() or poll(). In a FIFO queue, all new elements are inserted at the tail of the queue. Other kinds of queues may use different placement rules. Every Queue implementation must specify its ordering properties.

    3) The offer method inserts an element if possible, otherwise returning false. This differs from the Collection.add method, which can fail to add an element only by throwing an unchecked exception. The offer method is designed for use when failure is a normal, rather than exceptional occurrence, for example, in fixed-capacity (or "bounded") queues.

    4)The remove() and poll() methods remove and return the head of the queue. Exactly which element is removed from the queue is a function of the queue's ordering policy, which differs from implementation to implementation. The remove() and poll() methods differ only in their behavior when the queue is empty: the remove() method throws an exception, while the poll() method returns null.

    5)The element() and peek() methods return, but do not remove, the head of the queue.

    6) The Queue interface does not define the blocking queue methods, which are common in concurrent programming. These methods, which wait for elements to appear or for space to become available, are defined in the BlockingQueue interface, which extends this interface.

    7) Queue implementations generally do not allow insertion of null elements, although some implementations, such as LinkedList, do not prohibit insertion of null. Even in the implementations that permit it, null should not be inserted into a Queue, as null is also used as a special return value by the poll method to indicate that the queue contains no elements.

    8) Queue implementations generally do not define element-based versions of methods equals and hashCode but instead inherit the identity based versions from class Object, because element-based equality is not always well-defined for queues with the same elements but different ordering properties.

    9) Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java. Note that neither of these implementations is thread-safe. PriorityBlockingQueue is one alternative implementation if the thread-safe implementation is needed.

     */

    public static void main(String[] args) {
        
           // Create a Queue of Integers using LinkedList
           Queue<String> queue = new LinkedList<>();
           //new PriorityQueue<>();//FIFO
        
        // Displaying the Queue
        System.out.println("Queue elements: " + queue);

          // add elements to the queue
          queue.add("apple");
          queue.add("banana");
          queue.add("cherry");
  
          // print the queue
          System.out.println("Queue: " + queue);
  
          // remove the element at the front of the queue
          String front = queue.remove();
          System.out.println("Removed element: " + front);
  
          // print the updated queue
          System.out.println("Queue after removal: " + queue);
  
          // add another element to the queue
          queue.add("date");
  
          // peek at the element at the front of the queue
          String peeked = queue.peek();
          System.out.println("Peeked element: " + peeked);
  
          // print the updated queue
          System.out.println("Queue after peek: " + queue);
    }
}
