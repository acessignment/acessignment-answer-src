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
            System.out.println("Your bonus is 1,000");
        } else if (Department.equalsIgnoreCase("Accounting") && (Salary >= 15000) && (Status.equalsIgnoreCase("Permanent"))){
            System.out.println("Your bonus is 2,000");
        } else if (Department.equalsIgnoreCase("Budget") && (Salary >= 20000) && (Status.equalsIgnoreCase("Permanent"))){
            System.out.println("Your bonus is 3,000");
        } else if (Department.equalsIgnoreCase("Administration") && (Salary >= 25000) && (Status.equalsIgnoreCase("Permanent"))){
            System.out.println("Your bonus is 4,000");
        } else {
            System.out.println("No bonus");
        }
    }
}
