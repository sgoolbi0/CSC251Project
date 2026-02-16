public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; 
    private double height;
    private double weight;

    public Policy() {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    public Policy(String pNum, String pName, String fName, String lName, 
                  int a, String sStatus, double h, double w) {
        policyNumber = pNum;
        providerName = pName;
        firstName = fName;
        lastName = lName;
        age = a;
        smokingStatus = sStatus;
        height = h;
        weight = w;
    }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String pNum) { policyNumber = pNum; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String pName) { providerName = pName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String fName) { firstName = fName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lName) { lastName = lName; }

    public int getAge() { return age; }
    public void setAge(int a) { age = a; }

    public String getSmokingStatus() { return smokingStatus; }
    public void setSmokingStatus(String sStatus) { smokingStatus = sStatus; }

    public double getHeight() { return height; }
    public void setHeight(double h) { height = h; }

    public double getWeight() { return weight; }
    public void setWeight(double w) { weight = w; }

    public double getBMI() {
        return (weight * 703) / (height * height);
    } 

    public double getPrice() {
        double price = 600.0;
        if (age > 50) { price += 75.0; }
        if (smokingStatus.equalsIgnoreCase("smoker")) { price += 100.0; }
        double bmi = getBMI();
        if (bmi > 35) { price += (bmi - 35) * 20; }
        return price;
    } 
}