package com.sivaitservices.app.collection.iterable.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");

        List<String> createdArrayList = new ArrayList<>(list);

        System.out.println("list : "+createdArrayList.size());
    }
}
