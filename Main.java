import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course and Marks");
            System.out.println("3. Display One Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Update Personal Details");
            System.out.println("6. Update Marks");
            System.out.println("7. Delete Student");
            System.out.println("8. Delete Course");
            System.out.println("0. Exit");
            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    int id = readInt("ID: ");
                    String name = readText("Name: ");
                    int age = readInt("Age: ");
                    String email = readText("Email: ");
                    String phone = readText("Phone: ");
                    String address = readText("Address: ");
                    // Create object using the constructor
                    Student s = new Student(id, name, age, email, phone, address);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.addCourse(readInt("Student ID: "),
                                      readText("Course name: "),
                                      readDouble("Marks: "));
                    break;

                case 3:
                    manager.displayStudent(readInt("Student ID: "));
                    break;

                case 4:
                    manager.displayAll();
                    break;

                case 5:
                    int uid = readInt("Student ID to update: ");
                    String uname = readText("New name: ");
                    int uage = readInt("New age: ");
                    String uemail = readText("New email: ");
                    String uphone = readText("New phone: ");
                    String uaddress = readText("New address: ");
                    manager.updatePersonalDetails(uid, uname, uage, uemail, uphone, uaddress);
                    break;

                case 6:
                    manager.updateMarks(readInt("Student ID: "),
                                        readText("Course name: "),
                                        readDouble("New marks: "));
                    break;

                case 7:
                    manager.deleteStudent(readInt("Student ID to delete: "));
                    break;

                case 8:
                    manager.deleteCourse(readInt("Student ID: "),
                                         readText("Course name to remove: "));
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }

    // Helper methods so bad input does not crash the program
    static String readText(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readText(prompt).trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    static double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readText(prompt).trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
