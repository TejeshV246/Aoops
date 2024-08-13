import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String name;
    private String id;
    private List<Course> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
}
