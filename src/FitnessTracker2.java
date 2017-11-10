import java.util.Calendar;

class FitnessTracker2
{
    private int minutes = 0;
    private int activityID = 1;
    private Calendar date;
    private boolean factoryReset = true;

    FitnessTracker2(int minutes, int activityID, Calendar date)
    {
        this.minutes = minutes;
        this.activityID = activityID;
        this.date = date;
        this.factoryReset = false;
    }

    void displayData()
    {
        if (factoryReset)
        {
            resetDefault();
        }
        System.out.println(date.getTime());
        String activity = "Running";
        System.out.println("Current minutes:  " + minutes);
        switch (activityID)
        {
            case 0:
                activity = "Nothing";
                break;
            case 1:
                activity = "Running";
                break;
            case 2:
                activity = "Horse Ridding";
                break;
            case 3:
                activity = "Biking";
                break;
            case 4:
                activity = "Surfing";
                break;

        }
        System.out.println("Current activity: " + activity);
    }

    void increaseMinutes(int minutes)
    {
        if (factoryReset)
        {
            resetDefault();
        }
        this.minutes += minutes;
    }

    void setActivity(int activityID)
    {
        if (factoryReset)
        {
            resetDefault();
        }
        this.activityID = activityID;
    }

    void resetDefault()
    {
        minutes = 0;
        activityID = 1;
        date = Calendar.getInstance();
        date.set(Calendar.MONTH, Calendar.JANUARY);
        date.set(Calendar.DAY_OF_MONTH, 1);
        factoryReset = false;
    }
}
