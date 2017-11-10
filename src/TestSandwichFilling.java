class TestSandwichFilling
{
    static void testSandwichFilling()
    {
        System.out.println("Fillings");
        SandwichFilling bacon = new SandwichFilling("Bacon", 53.7);
        SandwichFilling eggSalad = new SandwichFilling("Egg Salad", 30.5);
        SandwichFilling tomatoAndLettuce = new SandwichFilling("Tomato & Lettuce", 37.4);

        System.out.println("Bacon" + "\t\t\t" + " ; Filling: " + bacon.getFillingType() + "\t\t\t" + " ; Calories Per Serving: " + bacon.getCaloriesPerServing());
        System.out.println("Egg Salad" + "\t\t" + " ; Filling: " + eggSalad.getFillingType() + "\t\t" + " ; Calories Per Serving: " + eggSalad.getCaloriesPerServing());
        System.out.println("Tomato & Lettuce" + " ; Filling: " + tomatoAndLettuce.getFillingType() + " ; Calories Per Serving: " + tomatoAndLettuce.getCaloriesPerServing());
        System.out.println();
    }
}