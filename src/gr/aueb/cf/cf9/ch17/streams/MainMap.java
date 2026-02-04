package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch11.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Product> products = new ArrayList<>(List.of(
               new Product("Apples", 12.5, 10),
               new Product("Oranges",4.1, 4, 10),
               new Product("Milk", 2.8, 10),
               new Product("Apples", 22.2, 10)
        ));

        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();
        squares.forEach(System.out::println);

        var listOfDescriptions = products.stream()
                .map(p -> p.getDescription())
                .toList();

        String listOfDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listOfDescriptions2);
    }
}
