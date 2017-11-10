public class TestBloodData
{
    public static void main(String[] args)
    {
        String[] bloodData;

        BloodData mich = new BloodData();
        BloodData bob = new BloodData("B", "-");

        System.out.println("Before changing the values:");

        bloodData = bob.getBloodData();
        System.out.printf("Bob ; bloodType: %2s", bloodData[0]);
        System.out.println(", rhFactor: " + bloodData[1]);

        bloodData = mich.getBloodData();
        System.out.printf("Mich; bloodType: %2s", bloodData[0]);
        System.out.println(", rhFactor: " + bloodData[1]);

        mich.setBloodType("AB", "+");
        bob.setBloodType("A", "-");

        System.out.println("\n" + "After changing the values:");

        bloodData = mich.getBloodData();
        System.out.printf("Mich; bloodType: %2s", bloodData[0]);
        System.out.println(", rhFactor: " + bloodData[1]);

        bloodData = bob.getBloodData();
        System.out.printf("Bob ; bloodType: %2s", bloodData[0]);
        System.out.println(", rhFactor: " + bloodData[1]);
    }
}
