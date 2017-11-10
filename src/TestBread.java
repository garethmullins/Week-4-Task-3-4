class TestBread
{
    static void testBread()
    {
        System.out.println("Bread");
        Bread rye = new Bread("Rye", 10.5);
        Bread grain = new Bread("Grain", 3.7);
        Bread wholemeal = new Bread("Wholemeal", 2.4);

        System.out.println("Rye" + "\t\t" + "  ; Filling: " + rye.getFillingType() + "\t" + "   ; Calories Per Serving: " + rye.getCaloriesPerServing());
        System.out.println("Grain" + "\t" + "  ; Filling: " + grain.getFillingType() + "\t" + "   ; Calories Per Serving:  " + grain.getCaloriesPerServing());
        System.out.println("Wholemeal" + " ; Filling: " + wholemeal.getFillingType() + " ; Calories Per Serving:  " + wholemeal.getCaloriesPerServing());
        System.out.println("\033[3m"+Bread.getMOTTO()+"\033[0m \n");
    }
}