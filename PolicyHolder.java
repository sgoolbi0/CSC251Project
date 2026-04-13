public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    public PolicyHolder(String fName, String lName, int a, String sStatus, double h, double w) {
        firstName = fName;
        lastName = lName;
        age = a;
        smokingStatus = sStatus;
        height = h;
        weight = w;
    }

    public PolicyHolder(PolicyHolder other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.smokingStatus = other.smokingStatus;
        this.height = other.height;
        this.weight = other.weight;
    }

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

    @Override
    public String toString() {
        return String.format("Policyholder's First Name: %s\n" +
                             "Policyholder's Last Name: %s\n" +
                             "Policyholder's Age: %d\n" +
                             "Policyholder's Smoking Status (Y/N): %s\n" +
                             "Policyholder's Height: %.1f inches\n" +
                             "Policyholder's Weight: %.1f pounds\n" +
                             "Policyholder's BMI: %.2f\n" +
                             "Policy Price: $%.2f", 
                             firstName, lastName, age, smokingStatus, height, weight, getBMI(), getPrice());
    }
}
