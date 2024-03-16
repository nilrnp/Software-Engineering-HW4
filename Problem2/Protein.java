package Homework4.Problem2;

import java.util.Arrays;
import java.util.List;

class Protein extends MealPlanFactory {
    @Override
    protected String createComponent() {
        List<String> options = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
        return getRandomOption(options);
    }
}