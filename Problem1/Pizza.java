package Homework4.Problem1;

import java.util.ArrayList;
import java.util.List;

enum Toppings {
    PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, EXTRA_CHEESE, PEPPERS, CHICKEN, OLIVES, SPINACH,
    TOMATO_AND_BASIL, BEEF, HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
}

class Pizza {
    private String chain;
    private String size;
    private List<Toppings> toppings;

    private Pizza(Builder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    static class Builder {
        private String chain;
        private String size;
        private List<Toppings> toppings = new ArrayList<>();

        Builder(String chain, String size) {
            this.chain = chain;
            this.size = size;
        }

        Builder addTopping(Toppings topping) {
            toppings.add(topping);
            return this;
        }

        Pizza build() {
            return new Pizza(this);
        }
    }
    
    void eat() {
        System.out.println("Pizza from " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: ");
        for (Toppings topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.println("Enjoy your pizza!\n");
    }
}