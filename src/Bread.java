class Bread
{
    private String fillingType;
    private double caloriesPerServing;
    private final static String MOTTO = "The staff of life";

    Bread(String fillingType, double caloriesPerServing)
    {
        this.fillingType = fillingType;
        this.caloriesPerServing = caloriesPerServing;
    }

    String getFillingType()
    {
        return fillingType;
    }

    double getCaloriesPerServing()
    {
        return caloriesPerServing;
    }

    static String getMOTTO()
    {
        return MOTTO;
    }
}