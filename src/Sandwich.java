public class Sandwich
{
    private String bread, filling;
    private double calories;

    Sandwich(String bread, double breadCalories, String filling, double fillingCalories)
    {
        this.bread = bread;
        this.filling = filling;
        this.calories = 2*breadCalories + fillingCalories;
    }

    public String getSandwichBread()
    {
        return this.bread;
    }

    public String getSandwichFilling()
    {
        return this.filling;
    }

    double getSandwichCalories()
    {
        return this.calories;
    }
}
