//  It is used to read input from the user.
import java.util.Scanner;

public class Dept_ifElse {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Department: ");
        String Department = scanner.next();

        System.out.print("Salary: ");
        int Salary = scanner.nextInt();

        System.out.print("Status: ");
        String Status = scanner.next();

        if (Department.equalsIgnoreCase("Miso") && (Salary >= 10000) && (Status.equalsIgnoreCase("Permanent"))){
            // It checks if the user's department is "Miso" , their salary is at least 10000, and their status is "Permanent"
            System.out.println("Your bonus is 1,000");
            // If the above conditions are met, this line prints a message saying that the user's bonus is 1000.
        } else if (Department.equalsIgnoreCase("Accounting") && (Salary >= 15000) && (Status.equalsIgnoreCase("Permanent"))){
            // If the first if block is not satisfied, this line starts an else-if block.
            // It checks if the user's department is "Accounting", their salary is at least 15000, and their status is "Permanent".
            System.out.println("Your bonus is 2,000");
            // If the above conditions are met, this line prints a message saying that the user's bonus is 2000.    
        } else if (Department.equalsIgnoreCase("Budget") && (Salary >= 20000) && (Status.equalsIgnoreCase("Permanent"))){
            // It checks if the user's department is "Budget", their salary is at least 20000, and their status is Permanent".
            System.out.println("Your bonus is 3,000");
            // If the above conditions are met, this line prints a message saying that the user's bonus is 3000.
        } else if (Department.equalsIgnoreCase("Administration") && (Salary >= 25000) && (Status.equalsIgnoreCase("Permanent"))){
            // It checks if the user's department is "Administration", their salary is at least 25000, and their status is "Permanent".
            System.out.println("Your bonus is 4,000");
        } else {
            // If none of the above conditions are met, this line starts an else block.
            System.out.println("No bonus");
            // This line prints a message saying that the user does not get a bonus.
        }
    }
    
}
