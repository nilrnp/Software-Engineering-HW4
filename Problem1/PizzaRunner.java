package Homework4.Problem1;

public class PizzaRunner {
    public static void main(String[] args) {

        // #1)
        Pizza hutSmall = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.MUSHROOMS)
                .addTopping(Toppings.EXTRA_CHEESE)
                .build();

        Pizza hutMedium = new Pizza.Builder("Pizza Hut", "Medium")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.SAUSAGE)
                .addTopping(Toppings.BACON)
                .addTopping(Toppings.ONIONS)
                .addTopping(Toppings.PEPPERS)
                .addTopping(Toppings.CHICKEN)
                .build();

        Pizza hutLarge = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.SAUSAGE)
                .addTopping(Toppings.MUSHROOMS)
                .addTopping(Toppings.BACON)
                .addTopping(Toppings.ONIONS)
                .addTopping(Toppings.EXTRA_CHEESE)
                .addTopping(Toppings.PEPPERS)
                .addTopping(Toppings.CHICKEN)
                .addTopping(Toppings.OLIVES)
                .build();

        hutSmall.eat();
        hutMedium.eat();
        hutLarge.eat();

        // #2)
        Pizza hutSmall2 = new Pizza.Builder("Pizza Hut", "Small")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.MUSHROOMS)
                .build();

        Pizza hutLarge2 = new Pizza.Builder("Pizza Hut", "Large")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.SAUSAGE)
                .addTopping(Toppings.MUSHROOMS)
                .build();

        hutSmall2.eat();
        hutLarge2.eat();

        Pizza littleCaesarsSmall = new Pizza.Builder("Little Caesars", "Small")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.MUSHROOMS)
                .addTopping(Toppings.EXTRA_CHEESE)
                .addTopping(Toppings.CHICKEN)
                .addTopping(Toppings.OLIVES)
                .addTopping(Toppings.SPICY_PORK)
                .build();

        Pizza littleCaesarsMedium = new Pizza.Builder("Little Caesars", "Medium")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.SAUSAGE)
                .addTopping(Toppings.BACON)
                .addTopping(Toppings.ONIONS)
                .addTopping(Toppings.PEPPERS)
                .addTopping(Toppings.CHICKEN)
                .addTopping(Toppings.OLIVES)
                .addTopping(Toppings.SPICY_PORK)
                .build();

        littleCaesarsSmall.eat();
        littleCaesarsMedium.eat();
        
        Pizza dominosSmall = new Pizza.Builder("Dominos", "Small")
                .addTopping(Toppings.PEPPERONI)
                .build();


        Pizza dominosLarge = new Pizza.Builder("Dominos", "Large")
                .addTopping(Toppings.PEPPERONI)
                .addTopping(Toppings.SAUSAGE)
                .addTopping(Toppings.MUSHROOMS)
                .build();

        dominosSmall.eat();
        dominosLarge.eat();
    }
}