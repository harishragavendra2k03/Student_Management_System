public class Course {
    private String courseName;
    private double marks;

    // Constructor
    public Course(String courseName, double marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() { return courseName; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public void display() {
        System.out.println("   Course: " + courseName + " | Marks: " + marks);
    }
}
