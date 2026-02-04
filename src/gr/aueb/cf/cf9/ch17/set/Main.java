package gr.aueb.cf.cf9.ch17.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        //add - No duplicates
        bag.add("apple");
        bag.add("banana");
        bag.add("orange");
        bag.add("apple");

        if (bag.contains("apple")){
            bag.remove("apple");
        }
        else {
            System.out.println("Aple not included");
        }
        bag.removeIf(item -> item.startsWith("b"));
        bag.forEach(System.out::println);
    }
}
