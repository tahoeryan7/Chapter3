package Chapter3;

// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Problem2
{
   public static void main (String[] args)
   {
           double currentSalary;  // employee's current  salary
           double raise=0;              // amount of the raise
           double newSalary;          // new salary for the employee
           String rating;             // performance rating
           double interestPercent = .2;
           double minimumPayment= 0;
           double newBalance = 0;
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the current salary: ");
           currentSalary = scan.nextDouble();
           double interest= interestPercent * currentSalary; 
           newBalance = (interest+currentSalary); 
           
           if(newBalance<50){
               minimumPayment=newBalance;
           }
           if(newBalance<=50 && newBalance>=300){
               minimumPayment=50.0;
           }
           if(newBalance>300){
               minimumPayment= (newBalance)*.2;
               }
           newBalance = (interest+currentSalary-minimumPayment); 
           
           // Compute the raise using if ...
 
           
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(currentSalary));
           System.out.println("Additional Charges: " + money.format(raise));
           System.out.println("Interest: " + money.format(interest));
           System.out.println("New Balance:          " + money.format(newBalance));
           System.out.println("Minimum Payment:          " + money.format(minimumPayment));
           System.out.println();
        }
}