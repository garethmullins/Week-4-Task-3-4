import java.util.Calendar;
import java.util.Scanner;
public class TestFitnessTracker2
{
    public static void main(String[] args)
    {
        int activityID, minutes;
        Calendar currentDate = Calendar.getInstance();

        Scanner input = new Scanner(System.in);
        FitnessTracker2 testA = new FitnessTracker2(35, 2, currentDate);
        FitnessTracker2 testB = new FitnessTracker2(30, 1, currentDate);
        FitnessTracker2 testC = new FitnessTracker2(15, 4, currentDate);
        FitnessTracker2 testD = new FitnessTracker2(20, 3, currentDate);

        System.out.print("Enter Activity ID ");
        activityID = input.nextInt();
        System.out.print("Enter Number of active minutes ");
        minutes = input.nextInt();

        System.out.println("\n A");

        System.out.println("Start");
        testA.displayData();
        testA.setActivity(activityID);
        System.out.println("\n Activity");
        testA.displayData();
        testA.increaseMinutes(minutes);
        System.out.println("\n Minutes");
        testA.displayData();
        testA.resetDefault();
        System.out.println("\n Default");
        testA.displayData();

        System.out.println("\n B");

        System.out.println("Start");
        testB.displayData();
        testB.setActivity(activityID);
        System.out.println("\n Activity");
        testB.displayData();
        testB.increaseMinutes(minutes);
        System.out.println("\n Minutes");
        testB.displayData();
        testB.resetDefault();
        System.out.println("\n Default");
        testB.displayData();

        System.out.println("\n C");

        System.out.println("Start");
        testC.displayData();
        testC.setActivity(activityID);
        System.out.println("\n Activity");
        testC.displayData();
        testC.increaseMinutes(minutes);
        System.out.println("\n Minutes");
        testC.displayData();
        testC.resetDefault();
        System.out.println("\n Default");
        testC.displayData();

        System.out.println("\n D");

        System.out.println("Start");
        testD.displayData();
        testD.setActivity(activityID);
        System.out.println("\n Activity");
        testD.displayData();
        testD.increaseMinutes(minutes);
        System.out.println("\n Minutes");
        testD.displayData();
        testD.resetDefault();
        System.out.println("\n Default");
        testD.displayData();
    }
}