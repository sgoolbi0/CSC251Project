import java.util.*;
import java.io.*;

public class Project_Sirina_Goolbis {
   public static void main(String[] args) throws IOException {
      
      File file = new File("PolicyInformation.txt");
      
      if (!file.exists()) {
         System.out.println("Unable to find the file: PolicyInformation.txt");
         return;
      }

      Scanner inputFile = new Scanner(file);
      ArrayList<Policy> policyList = new ArrayList<>();

      while (inputFile.hasNext()) {
         String pNum = inputFile.nextLine();
         String pName = inputFile.nextLine();
         String fName = inputFile.nextLine();
         String lName = inputFile.nextLine();
         int age = inputFile.nextInt();
         inputFile.nextLine(); // Clear newline buffer 
         String status = inputFile.nextLine();
         double height = inputFile.nextDouble();
         double weight = inputFile.nextDouble();

         if (inputFile.hasNextLine()) {
             inputFile.nextLine(); 
             if (inputFile.hasNextLine()) {
                 inputFile.nextLine(); 
             }
         }

         Policy policy = new Policy(pNum, pName, fName, lName, age, status, height, weight);
         policyList.add(policy);
      }
      
      inputFile.close();

      int smokers = 0;
      int nonSmokers = 0;

      for (Policy p : policyList) {
         System.out.println("Policy Number: " + p.getPolicyNumber());
         System.out.println("Provider Name: " + p.getProviderName());
         System.out.println("Policyholder’s First Name: " + p.getFirstName());
         System.out.println("Policyholder’s Last Name: " + p.getLastName());
         System.out.println("Policyholder’s Age: " + p.getAge());
         System.out.println("Policyholder’s Smoking Status (smoker/non-smoker): " + p.getSmokingStatus());
         System.out.printf("Policyholder’s Height: %.1f inches\n", p.getHeight());
         System.out.printf("Policyholder’s Weight: %.1f pounds\n", p.getWeight());
         System.out.printf("Policyholder’s BMI: %.2f\n", p.getBMI());
         System.out.printf("Policy Price: $%.2f\n", p.getPrice());
         System.out.println();

         if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokers++;
         } else {
            nonSmokers++;
         }
      }

      //Display final counts
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
   }
}
