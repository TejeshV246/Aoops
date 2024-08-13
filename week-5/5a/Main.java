public class Main {
    public static void main(String[] args) {
        // Create course and student
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics");
        Student student1 = new Student("John Doe", "S001");

        // Create enrollment manager
        IEnrollmentManager enrollmentManager = new EnrollmentManager();

        // Enroll student in course
        enrollmentManager.enrollStudentInCourse(student1, mathCourse);

        // Output results
        System.out.println("Student enrolled in courses: ");
        for (Course course : student1.getEnrolledCourses()) {
            System.out.println(course.getCourseName());
        }

        System.out.println("Students in course: ");
        for (Student student : mathCourse.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
