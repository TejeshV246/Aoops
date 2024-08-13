import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
}
