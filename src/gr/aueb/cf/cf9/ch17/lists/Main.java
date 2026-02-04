package gr.aueb.cf.cf9.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Athens");
        cities.add("Berlin");
        cities.add("Paris");

        //Get
        String city = cities.get(0);
        System.out.println(city);

        //set - update
        int position =cities.indexOf("Paris"); //equals
        if (position == -1){
            System.out.println("City not found");
        }
        else {
            cities.set(position, "Tokyo");
        }

        //Remove
        if (cities.contains("Tokyo")){
            cities.remove("Tokyo");
        }
        else{
            System.out.println("City not found");
        }

    //Traverse with for
    for (int i = 0; i < cities.size(); i++){
        System.out.println(cities.get(i));
    }

    //Traverse with enhanced for
    for (String c : cities){
        System.out.println(c);
    }

    //Iterator
    Iterator<String> iterator = cities.iterator();
    while(iterator.hasNext()){
        String c2 = iterator.next();
        System.out.println(c2);
    }

    Iterator<String> it = cities.iterator();
    while (it.hasNext()){
        if (it.next().equals("Tokyo")){
            it.remove();
        }
    }
    cities.removeIf(c -> c.equals("Tokyo"));
    //cities.forEach(c -> System.out.println(c));
    cities.forEach(System.out::println);
}
}