package gr.aueb.cf.cf9.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> countries new HashMap<>();

        //Add and Update
        countries.put("GR", "Greece");      //Insert value
        countries.put("USA", "Untd States");
        countries.put("IT", "Italy");
        countries.put("GR", "Germany");  //Will do update

        //Get
        String country = countries.get("GR");
        System.out.println(country);

        //Remove
        countries.remove("USA");

        //Traverse
        countries.forEach((key, value) -> System.out.println(key + " - " + value));
    var filteredCities = countries.entrySet().stream()
            .filter(entry -> entry.getKey().length() <= 2 )
            .collect(Collector.toSet());
    filteredCities.forEach(System.out::println);
    }
}
