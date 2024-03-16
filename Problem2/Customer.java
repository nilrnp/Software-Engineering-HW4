package Homework4.Problem2;

class Customer {
    public String name;
    public String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public Meal createMeal() {
        Carbs carbsFactory = new Carbs();
        Protein proteinFactory = new Protein();
        Fats fatsFactory = new Fats();

        String carb = carbsFactory.createComponent();
        String protein = proteinFactory.createComponent();
        String fat = fatsFactory.createComponent();

        return new Meal(carb, protein, fat);
    }
}