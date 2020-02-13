package AdvancedJava;

import java.util.HashMap;

public class Hashmap {
    //No duplicates allowed
    public static void main (String[] args){
        HashMap<String, Integer> phonebook= new HashMap<>();
        phonebook.put("Kevin", 2323423);
        phonebook.put("Jones", 346534);
        phonebook.put("Brenda", 123123);
        phonebook.put("Avi", 234234);
        phonebook.put("Jack", 574675);

        if (phonebook.containsKey("Brenda"))
            System.out.println(phonebook.get("Brenda"));

        System.out.println(phonebook);

    }
}
