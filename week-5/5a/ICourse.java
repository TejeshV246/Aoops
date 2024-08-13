import java.util.List;

public interface ICourse {
    String getCourseId();
    String getCourseName();
    List<Student> getEnrolledStudents();
    void addStudent(Student student);
}
