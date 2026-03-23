//The policy class represents the insurance policy for a policyholder
public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; 
    private double height;
    private double weight;

/**
  *No argument constructor that initializes attributes with default values
*/ 
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
/** * specific values assigned to constructors to initialize policy
  * @param pNum The policy number
  * @param pName The provider name
  * @param fName The policy holder's first name
  * @param lName The policy holder's last name
  * @param a The policy holder's age
  * @param sStatus The policy holder's smoking status
  * @param h The policy holder's height in inches
  * @param w The policy holder's weight in pounds
*/

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

/**
  * Return the Policy number
  * @return The policyNumber
*/
    public String getPolicyNumber() { return policyNumber; }
    
/**
  * Sets the Policy number
  * @param pNum The policy number to set
*/
    public void setPolicyNumber(String pNum) { policyNumber = pNum; }

/**
  * Return the Provider name
  * @return The providerName
*/
    public String getProviderName() { return providerName; }
    
/**
  * Sets the Provider name
  * @param pName The provider name to set
*/
    public void setProviderName(String pName) { providerName = pName; }

/**
  * Return the policy holder's first name
  * @return The firstName
*/
    public String getFirstName() { return firstName; }
    
/**
  * Sets the policy holder's first name
  * @param fName the first name to set
*/
    public void setFirstName(String fName) { firstName = fName; }

/**
  * Return the policy holder's last name
  * @return The lastName
*/
    public String getLastName() { return lastName; }
    
/**
  * Sets the policy holder's last name
  * @param lName the last name to set
*/
    public void setLastName(String lName) { lastName = lName; }

/**
  * Returns the policyholder's age
  * @return The age
*/

    public int getAge() { return age; }
    
/**
  * Sets the policyholder's age
  * @param a The age to set
*/
    public void setAge(int a) { age = a; }

/**
  * Returns the policyholder's smoking status
  * @return The smoking status (smoker or non-smoker)
*/
    public String getSmokingStatus() { return smokingStatus; }
    
/**
  * Sets the policyholder's smoking status
  * @param sStatus The smoking status to set
*/
    public void setSmokingStatus(String sStatus) { smokingStatus = sStatus; }

/**
  * Returns the policyholder's height
  * @return The height in inches
*/
    public double getHeight() { return height; }
    
/**
  * Sets the policyholder's height
  * @param h The height to set
*/
    public void setHeight(double h) { height = h; }

/**
  * Returns the policyholder's weight
  * @return The weight in pounds
*/
    public double getWeight() { return weight; }
    
/**
  * Sets the policyholder's weight
  * @param w The weight to set
*/
    public void setWeight(double w) { weight = w; }

/**
  * Calculate the BMI or Body Mass Index
  * @return The calculated BMI
*/
    public double getBMI() {
        return (weight * 703) / (height * height);
    } 

/**
  * Calculates the total policy price
  * @return The final price fo the policy
*/
    public double getPrice() {
        double price = 600.0;
        if (age > 50) { price += 75.0; }
        if (smokingStatus.equalsIgnoreCase("smoker")) { price += 100.0; }
        double bmi = getBMI();
        if (bmi > 35) { price += (bmi - 35) * 20; }
        return price;
    } 
}
