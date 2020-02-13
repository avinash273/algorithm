package AdvancedJava;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap {
    //No duplicates allowed
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 2323423);
        phonebook.put("Jones", 346534);
        phonebook.put("Brenda", 123123);
        phonebook.put("Avi", 234234);
        phonebook.put("Jack", 574675);

        if (phonebook.containsKey("Brenda"))
            System.out.println(phonebook.get("Brenda"));

        System.out.println(phonebook);

        //LinkedHashMap is smart, it print most accessed at the bottom and keep track of order of entries
        LinkedHashMap<String, Integer> phonebook2 = new LinkedHashMap<>(4, 0.75f, true);
        phonebook2.put("Kevin", 2323423);
        phonebook2.put("Jones", 346534);
        phonebook2.put("Brenda", 123123);
        phonebook2.put("Avi", 234234);
        phonebook2.put("Jack", 574675);

        System.out.println(phonebook2.get("Kevin"));
        System.out.println(phonebook2);

    }
}
