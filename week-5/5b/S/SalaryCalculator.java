public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        // Basic salary calculation based on role
        switch (employee.getRole()) {
            case "Manager":
                return 70000;
            case "Developer":
                return 50000;
            case "Intern":
                return 20000;
            default:
                return 30000;
        }
    }
}
