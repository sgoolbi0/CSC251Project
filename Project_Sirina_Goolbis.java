import java.util.*; 
import java.io.*;   

public class Project_Sirina_Goolbis {
   public static void main(String[] args) throws IOException { // Added throws
      
      // 1. Open the file (Must match the exact name provided by instructor)
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);

      // 2. Create the ArrayList to hold all policy objects
      ArrayList<Policy> policyList = new ArrayList<>();

      // 3. Loop through the file
      while (inputFile.hasNext()) {
         String pNum = inputFile.nextLine();
         String pName = inputFile.nextLine();
         String fName = inputFile.nextLine();
         String lName = inputFile.nextLine();
         int age = inputFile.nextInt();
         inputFile.nextLine(); // Clear the buffer
         String status = inputFile.nextLine();
         double height = inputFile.nextDouble();
         double weight = inputFile.nextDouble();

         // Skip the blank line between policies if there is one
         if (inputFile.hasNextLine()) {
             inputFile.nextLine(); 
             if (inputFile.hasNextLine()) inputFile.nextLine(); 
         }

         // Create the object and add it to the list
         policyList.add(new Policy(pNum, pName, fName, lName, age, status, height, weight));
      }
      inputFile.close();

      // 4. Track counts
      int smokers = 0;
      int nonSmokers = 0;

      // 5. Use a for-each loop to display everything
      for (Policy p : policyList) {
         System.out.println("Policy Number: " + p.getPolicyNumber());
         System.out.println("Provider Name: " + p.getProviderName());
         System.out.println("Policyholder’s First Name: " + p.getFirstName());
         // ... (Add the rest of your print statements here using p.get methods) ...
         System.out.printf("Policy Price: $%.2f\n\n", p.getPrice());

         if (p.getSmokingStatus().equalsIgnoreCase("smoker")) smokers++;
         else nonSmokers++;
      }

      // 6. Final counts
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
   }
}
