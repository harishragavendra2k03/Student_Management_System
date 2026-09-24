# Student_Management_System

A simple console-based Java application to manage student information, including personal details, courses and marks. 
It supports basic CRUD operations (Create, Read, Update, Delete) using plain Java, constructors and `ArrayList`.

## Features

- **Create**
  - Add a new student (ID, name, age, email, phone, address)
  - Add courses and marks to a student
- **Read**
  - Display a single student's record
  - Display all student records (including each student's average marks)
- **Update**
  - Update a student's personal details
  - Update marks for a course
- **Delete**
  - Delete a student record
  - Remove a course from a student
- Input validation for numeric fields, so invalid input does not crash the program
- Duplicate student IDs and duplicate courses per student are rejected

## Project Structure

```
StudentInfoCRUD/
├── Course.java           # Course name and marks
├── Student.java          # Student details and list of courses
├── StudentManager.java   # CRUD operations on student records
├── Main.java             # Menu-driven console interface
└── README.md
```

| File | Description |
|------|-------------|
| `Course.java` | Model class holding a course name and its marks |
| `Student.java` | Model class with personal details, a list of courses and an average-marks calculation |
| `StudentManager.java` | Stores students in an `ArrayList` and provides the add, find, display, update and delete operations |
| `Main.java` | Entry point with the interactive menu |

## Requirements

- Java Development Kit (JDK) 8 or higher

Check your installation:

```bash
java -version
javac -version
```

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/<your-username>/<your-repo-name>.git
   cd <your-repo-name>
   ```

2. Compile all files:

   ```bash
   javac *.java
   ```

3. Run the application:

   ```bash
   java Main
   ```

## Menu Options

```
===== Student Management System =====
1. Add Student
2. Add Course and Marks
3. Display One Student
4. Display All Students
5. Update Personal Details
6. Update Marks
7. Delete Student
8. Delete Course
0. Exit
```

## Sample Output

```
----------------------------------------
ID      : 101
Name    : Arun Kumar
Age     : 20
Email   : arun@example.com
Phone   : 9876543210
Address : Chennai
Courses :
   Course: Mathematics | Marks: 85.0
   Course: Physics | Marks: 78.0
Average : 81.5
----------------------------------------
```

## Concepts Used

- Classes and objects
- Constructors
- Encapsulation (private fields with getters and setters)
- `ArrayList` collections
- Loops, `switch` statements and exception handling (`NumberFormatException`)
- `Scanner` for console input

## Limitations

- Data is stored in memory only and is lost when the program exits.
- There is no file or database persistence.

## Future Improvements

- Save and load records from a file or database (e.g. JDBC with MySQL)
- Search students by name
- Grade calculation and ranking
- GUI using JavaFX or Swing

## Contributing

Contributions are welcome. Fork the repository, create a feature branch and open a pull request.

## License

This project is open source and available under the [MIT License](LICENSE).
