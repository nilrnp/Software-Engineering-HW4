package Homework4.Problem2;

import java.util.Arrays;
import java.util.List;

class Fats extends MealPlanFactory {
    @Override
    protected String createComponent() {
        List<String> options = Arrays.asList("Avocado", "Sour cream", "Tuna", "Peanuts");
        return getRandomOption(options);
    }
}
