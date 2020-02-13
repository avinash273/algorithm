package AdvancedJava;

import java.util.*;

public class LinkedLists_ArrayList {
    public static void main(String[] args){
        //Linked List is better when you want to add more elements in between
        //Linked List uses more space
        //ArrayList used
        //less space and
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        ArrayList myArr = new ArrayList();
        myArr.add("A");
        myArr.add(0,"B");
        System.out.println(myArr);
    }
}
