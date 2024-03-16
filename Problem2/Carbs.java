package Homework4.Problem2;

import java.util.Arrays;
import java.util.List;


class Carbs extends MealPlanFactory {
    @Override
    protected String createComponent() {
        List<String> options = Arrays.asList("Cheese", "Bread", "Lentils", "Pistachio");
        return getRandomOption(options);
    }
}
