class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Getter methods for displaying information
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class MemberInfo {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "123 Elm St", 50000, "Software Development");
        Manager manager = new Manager("Jane Smith", 45, "098-765-4321", "456 Oak St", 80000, "IT");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("Specialization: " + employee.getSpecialization());
        employee.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Phone Number: " + manager.getPhoneNumber());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Department: " + manager.getDepartment());
        manager.printSalary();
    }
}
