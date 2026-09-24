import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // ---------- CREATE ----------
    public void addStudent(Student student) {
        if (findById(student.getId()) != null) {
            System.out.println("A student with ID " + student.getId() + " already exists.");
            return;
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void addCourse(int id, String courseName, double marks) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        if (s.findCourse(courseName) != null) {
            System.out.println("Course already exists for this student.");
            return;
        }
        s.addCourse(new Course(courseName, marks));
        System.out.println("Course added successfully.");
    }

    // ---------- READ ----------
    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public void displayStudent(int id) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
        } else {
            s.display();
        }
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    // ---------- UPDATE ----------
    public void updatePersonalDetails(int id, String name, int age,
                                      String email, String phone, String address) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        s.setName(name);
        s.setAge(age);
        s.setEmail(email);
        s.setPhone(phone);
        s.setAddress(address);
        System.out.println("Personal details updated successfully.");
    }

    public void updateMarks(int id, String courseName, double marks) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        Course c = s.findCourse(courseName);
        if (c == null) {
            System.out.println("Course not found for this student.");
            return;
        }
        c.setMarks(marks);
        System.out.println("Marks updated successfully.");
    }

    // ---------- DELETE ----------
    public void deleteStudent(int id) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        students.remove(s);
        System.out.println("Student deleted successfully.");
    }

    public void deleteCourse(int id, String courseName) {
        Student s = findById(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        if (s.removeCourse(courseName)) {
            System.out.println("Course removed successfully.");
        } else {
            System.out.println("Course not found for this student.");
        }
    }
}
