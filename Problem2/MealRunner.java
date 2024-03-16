package Homework4.Problem2;

import java.util.Arrays;
import java.util.List;

public class MealRunner {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Nil", "No Restriction"),
                new Customer("Donovan", "Paleo"),
                new Customer("Alley", "Vegan"),
                new Customer("Douglas", "Nut Allergy"),
                new Customer("Jake", "No Restriction"),
                new Customer("Marcus", "Vegan")
        );

        for (Customer customer : customers) {
            Meal meal = customer.createMeal();
            System.out.println(customer.name + "'s meal: " + meal);
        }
    }
}