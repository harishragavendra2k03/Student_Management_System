import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;
    private ArrayList<Course> courses;

    // Constructor
    public Student(int id, String name, int age, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.courses = new ArrayList<>();
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public ArrayList<Course> getCourses() { return courses; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }

    // Course helpers
    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String courseName) {
        for (Course c : courses) {
            if (c.getCourseName().equalsIgnoreCase(courseName)) {
                return c;
            }
        }
        return null;
    }

    public boolean removeCourse(String courseName) {
        Course c = findCourse(courseName);
        if (c == null) return false;
        courses.remove(c);
        return true;
    }

    public double getAverage() {
        if (courses.isEmpty()) return 0;
        double total = 0;
        for (Course c : courses) {
            total += c.getMarks();
        }
        return total / courses.size();
    }

    public void display() {
        System.out.println("----------------------------------------");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Email   : " + email);
        System.out.println("Phone   : " + phone);
        System.out.println("Address : " + address);
        System.out.println("Courses :");
        if (courses.isEmpty()) {
            System.out.println("   (none)");
        } else {
            for (Course c : courses) {
                c.display();
            }
            System.out.println("Average : " + getAverage());
        }
        System.out.println("----------------------------------------");
    }
}
