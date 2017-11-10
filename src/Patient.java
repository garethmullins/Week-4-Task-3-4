class Patient
{
    private String ID = "0000";
    private int age = 0;
    private String[] bloodData = new String[]{"O", "+"};

    Patient(String ID, int age, String[] bloodData)
    {
        this.ID = ID;
        this.age= age;
        this.bloodData = bloodData;
    }

    Patient(String ID, int age)
    {
        this.ID = ID;
        this.age= age;
    }

    Patient(String ID, String[] bloodData)
    {
        this.ID = ID;
        this.bloodData = bloodData;
    }

    Patient(int age, String[] bloodData)
    {
        this.age= age;
        this.bloodData = bloodData;
    }

    Patient(String ID)
    {
        this.ID = ID;
    }

    Patient(int age)
    {
        this.age= age;
    }

    Patient(String[] bloodData)
    {
        this.bloodData = bloodData;
    }

    Patient()
    {
    }

    void setID(String ID) {
        this.ID = ID;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setBloodData(String[] bloodData) {
        this.bloodData = bloodData;
    }

    String getID() {
        return ID;
    }

    int getAge() {
        return age;
    }

    String[] getBloodData() {
        return bloodData;
    }
}
