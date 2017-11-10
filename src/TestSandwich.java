import java.util.Scanner;

public class TestSandwich
{
    static private String[] breads = new String[]{"Rye", "Grain", "Wholemeal"};
    static private String[] fillings = new String[]{"Bacon", "Egg Salad", "Tomato & Lettuce"};
    static private String bread, filling;
    static private double breadCalories, fillingCalories;
    static private double calories;

    public static void main(String [] args)
    {

        TestBread.testBread();
        while (bread == null) {
            Scanner inputBread = new Scanner(System.in);
            System.out.println("A for \"Rye\" bread, B for \"Grain\" bread, C for \"Wholemeal\" bread");
            switch (inputBread.nextLine().toUpperCase()) {
                case "A":
                    bread = "Rye";
                    breadCalories = 10.5;
                    break;
                case "B":
                    bread = "Grain";
                    breadCalories = 3.7;
                    break;
                case "C":
                    bread = "Wholemeal";
                    breadCalories = 2.4;
                    break;
            }
        }

        TestSandwichFilling.testSandwichFilling();

        while (filling == null)
        {
            Scanner inputFilling = new Scanner(System.in);
            System.out.println("A for \"Bacon\" filling, B for \"Egg Salad\" filling, C for \"Tomato & Lettuce\" filling");
            switch (inputFilling.nextLine().toUpperCase())
            {
                case "A":
                    filling = "Bacon";
                    fillingCalories = 53.7;
                    break;
                case "B":
                    filling = "Egg Salad";
                    fillingCalories = 30.5;
                    break;
                case "C":
                    filling = "Tomato & Lettuce";
                    fillingCalories = 37.4;
                    break;
            }
        }
        Sandwich sandwich = new Sandwich(bread, breadCalories, filling, fillingCalories);

        calories = sandwich.getSandwichCalories();

        System.out.println("Sandwich made of " + bread + " bread and " + filling + " containing " + calories + " calories.");

        System.out.println("Sandwich:\nBread: " + bread + "\t; Filling: " + filling + "\t; Calories:  " + calories);
    }
}
