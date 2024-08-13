public class EnrollmentManager implements IEnrollmentManager {
    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
        course.addStudent(student);
    }
}
