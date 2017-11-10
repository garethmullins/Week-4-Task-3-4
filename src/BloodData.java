class BloodData
{
    private String bloodType = "O";
    private String rhFactor = "+";

    BloodData(String bloodType, String rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    BloodData()
    {
    }

    String[] getBloodData()
    {
        return new String[]{this.bloodType, this.rhFactor};
    }

    void setBloodType(String bloodType, String rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
}