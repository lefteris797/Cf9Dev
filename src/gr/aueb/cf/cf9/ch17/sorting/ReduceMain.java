package gr.aueb.cf.cf9.ch17.sorting;

import gr.aueb.cf.cf9.ch11.Product;

import java.util.ArrayList;
import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2 ,3 ,4 ,5);
        List<Product> products = new ArrayList<>(List.of(
                new Product(1L, "Apples", "Fruit", 12.5, 10,),
                new Product(2L, "Oranges", "fruit", 4.1, 4,),
                new Product(3L, "Milk", "Diary", 2.8, 10),
                new Product(4L, "Apples", "Fruit", 22.2, 10)
        ));

        int totalSum = numbers.stream()
                .reduce(0, (sum, num) -> sum + num);
        int totalSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        int sumOfQuantinties = products.stream()
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);
        int sumOfQuantinties2 = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();
        var sortedProductDescriptionsGE100 = products.stream()
                .filter(p-> p.getQuantity() >= 100)
                .sorted((p1, p2) -> p2.getQuantity() - p1.getQuantity())
                .map(Product::getDescription)
                .map(String::toUpperCase)
                .toList();

    }
}
