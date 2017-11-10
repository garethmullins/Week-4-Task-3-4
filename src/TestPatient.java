import java.util.concurrent.ThreadLocalRandom;
public class TestPatient
{
    private static String[] patientName = new String[]{"Mich", "Mick", "Jon", "Bob", "Lissy", "Sarena", "Micky", "Jessica"};
    private static String[] ID = new String[8];
    private static int[] age = new int[8];
    private static String[][] bloodData = new String[8][2];

    private static Patient Mich = new Patient("0001");
    private static Patient Mick = new Patient(37);
    private static Patient Jon = new Patient(new String[]{"A", "+"});
    private static Patient Bob = new Patient("0004", 78, new String[]{"AB", "+"});
    private static Patient Lissy = new Patient("0005", new String[]{"O", "-"});
    private static Patient Sarena = new Patient("0006", 57);
    private static Patient Micky = new Patient();
    private static Patient Jessica = new Patient(23, new String[]{"B", "-"});

    public static void main(String[] args)
    {
        StringBuilder patientID;
        int patientAge;

        getData();
        printData();

        for (int i = 0; i < patientName.length; i++)
        {
            // ID
            if (ID[i].equals("0000"))
            {
                patientID = new StringBuilder((String.valueOf(i + 1)));
                if (patientID.length() == 1)
                {
                    patientID.insert(0, "000");
                } else if (patientID.length() == 2)
                {
                    patientID.insert(0, "00");
                } else if (patientID.length() == 3)
                {
                    patientID.insert(0, "0");
                }
                ID[i] = patientID.toString();
            }

            // Age
            if (age[i] == 0)
            {
                patientAge = ThreadLocalRandom.current().nextInt(1, 120);
                age[i] = patientAge;
            }

            // BloodData
            bloodData[0] = new String[]{"A", "-"};
            bloodData[1] = new String[]{"B", "-"};
            bloodData[2] = new String[]{"A", "+"};
            bloodData[3] = new String[]{"AB", "+"};
            bloodData[4] = new String[]{"O", "-"};
            bloodData[5] = new String[]{"O", "+"};
            bloodData[6] = new String[]{"A", "-"};
            bloodData[7] = new String[]{"B", "-"};
        }

        setData();
        printData();
    }

    private static void getData()
    {
        ID[0] = Mich.getID();
        ID[1] = Mick.getID();
        ID[2] = Jon.getID();
        ID[3] = Bob.getID();
        ID[4] = Lissy.getID();
        ID[5] = Sarena.getID();
        ID[6] = Micky.getID();
        ID[7] = Jessica.getID();

        age[0] = Mich.getAge();
        age[1] = Mick.getAge();
        age[2] = Jon.getAge();
        age[3] = Bob.getAge();
        age[4] = Lissy.getAge();
        age[5] = Sarena.getAge();
        age[6] = Micky.getAge();
        age[7] = Jessica.getAge();

        bloodData[0] = Mich.getBloodData();
        bloodData[1] = Mick.getBloodData();
        bloodData[2] = Jon.getBloodData();
        bloodData[3] = Bob.getBloodData();
        bloodData[4] = Lissy.getBloodData();
        bloodData[5] = Sarena.getBloodData();
        bloodData[6] = Micky.getBloodData();
        bloodData[7] = Jessica.getBloodData();
    }

    private static void setData()
    {
        Mich.setID(ID[0]);
        Mick.setID(ID[1]);
        Jon.setID(ID[2]);
        Bob.setID(ID[3]);
        Lissy.setID(ID[4]);
        Sarena.setID(ID[5]);
        Micky.setID(ID[6]);
        Jessica.setID(ID[7]);

        Mich.setAge(age[0]);
        Mick.setAge(age[1]);
        Jon.setAge(age[2]);
        Bob.setAge(age[3]);
        Lissy.setAge(age[4]);
        Sarena.setAge(age[5]);
        Micky.setAge(age[6]);
        Jessica.setAge(age[7]);

        Mich.setBloodData(bloodData[0]);
        Mick.setBloodData(bloodData[1]);
        Jon.setBloodData(bloodData[2]);
        Bob.setBloodData(bloodData[3]);
        Lissy.setBloodData(bloodData[4]);
        Sarena.setBloodData(bloodData[5]);
        Micky.setBloodData(bloodData[6]);
        Jessica.setBloodData(bloodData[7]);
    }

    private static void printData()
    {
        for (int i = 0; i < patientName.length; i++)
        {
            System.out.printf("%-9s", patientName[i]);
            System.out.printf("; ID: " + ID[i] + ", Age: " + "%3s", age[i]);
            System.out.printf(", Blood Type: " + "%2s", bloodData[i][0]);
            System.out.println(", rhFactor: " + bloodData[i][1]);
        }
        System.out.println();
    }
}