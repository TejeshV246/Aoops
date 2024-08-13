import java.util.List;

public interface IStudent {
    String getName();
    String getId();
    List<Course> getEnrolledCourses();
    void enrollInCourse(Course course);
}
