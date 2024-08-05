
package com.sivaitservices.app.collection.iterable;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    //other classes are form java.util.concurrent
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1,2,3,4,5});

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            if((Integer)iterator.next() == 3){
                list.add(6);
            }
        }
        System.out.println(list);
    }
    
}
