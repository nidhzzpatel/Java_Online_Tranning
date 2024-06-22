package InfoEmp.Nidhi.directory;

import java.util.Scanner;

public class DirectoryEmpInfo {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Display all entries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Unique ID: ");
                    String uniqueId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Telephone Number (optional): ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter Mobile Number (optional): ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();

                    DirectoryEntry entry = new DirectoryEntry(uniqueId, name, address, telephoneNumber, mobileNumber, headOfFamily);
                    if (directory.addEntry(entry)) {
                        System.out.println("Entry added successfully.");
                    } else {
                        System.out.println("An entry with this Unique ID already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Unique ID of the entry to edit: ");
                    String editUniqueId = scanner.nextLine();
                    System.out.print("Enter new Name (leave blank to keep unchanged): ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Address (leave blank to keep unchanged): ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new Telephone Number (leave blank to keep unchanged): ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter new Mobile Number (leave blank to keep unchanged): ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter new Head of Family (leave blank to keep unchanged): ");
                    String newHeadOfFamily = scanner.nextLine();

                    if (directory.editEntry(editUniqueId, newName, newAddress, newTelephoneNumber, newMobileNumber, newHeadOfFamily)) {
                        System.out.println("Entry edited successfully.");
                    } else {
                        System.out.println("No entry found with this Unique ID.");
                    }
                    break;

                case 3:
                    directory.printAllEntries();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
