import com.Nidhi.assignment.employees.Developer;
import com.Nidhi.assignment.employees.Manager;
import com.Nidhi.assignment.utilities.EmployeeUtilities;


public class EmployeeMain {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice Johnson", "M123", 90000, "IT");
        Developer developer = new Developer("Bob Smith", "D456", 80000, "Java");

        // Use EmployeeUtilities to perform operations on the employee objects
        System.out.println("Before salary increase:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 10); // 10% increase
        EmployeeUtilities.increaseSalary(developer, 15); // 15% increase

        System.out.println("\nAfter salary increase:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
