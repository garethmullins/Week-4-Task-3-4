class SandwichFilling {
    private String fillingType;
    private double caloriesPerServing;

    SandwichFilling(String fillingType, double caloriesPerServing) {
        this.fillingType = fillingType;
        this.caloriesPerServing = caloriesPerServing;
    }

    String getFillingType() {
        return fillingType;
    }

    double getCaloriesPerServing() {
        return caloriesPerServing;
    }
}