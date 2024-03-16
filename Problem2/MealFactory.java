package Homework4.Problem2;

import java.util.Random;
import java.util.Arrays;
import java.util.List;

abstract class MealPlanFactory {
    private static MealPlanFactory instance;

    protected MealPlanFactory() {
    }

    public static MealPlanFactory getInstance() {
        if (instance == null) {
            instance = createInstance();
        }
        return instance;
    }

    protected abstract String createComponent();

    private static MealPlanFactory createInstance() {
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return new Carbs();
            case 1:
                return new Protein();
            case 2:
                return new Fats();
            default:
                throw new IllegalArgumentException("");
        }
    }

    protected String getRandomOption(List<String> options) {
        Random random = new Random();
        int index = random.nextInt(options.size());
        return options.get(index);
    }
}
