public class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Course c = new Course("Mathematics", 38);
        System.out.println("Course: " + c.getCourseName() + ", Marks: " + c.getMarks());
    }
}
