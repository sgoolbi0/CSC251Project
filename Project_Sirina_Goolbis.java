import java.util.Scanner;

public class Project_Sirina_Goolbis {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      System.out.print("Please enter the Policy Number: ");
      String pNum = keyboard.nextLine();

      System.out.print("Please enter the Provider Name: ");
      String pName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder’s First Name: ");
      String fName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder’s Last Name: ");
      String lName = keyboard.nextLine();

      System.out.print("Please enter the Policyholder’s Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String status = keyboard.nextLine();

      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double height = keyboard.nextDouble();

      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      double weight = keyboard.nextDouble();


      Policy policy = new Policy(pNum, pName, fName, lName, age, status, height, weight);

      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder’s First Name: " + policy.getFirstName());
      System.out.println("Policyholder’s Last Name: " + policy.getLastName());
      System.out.println("Policyholder’s Age: " + policy.getAge());
      System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
      
      System.out.printf("Policyholder’s Height: %.1f inches\n", policy.getHeight());
      System.out.printf("Policyholder’s Weight: %.1f pounds\n", policy.getWeight());
      System.out.printf("Policyholder’s BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
   }
}