package collections;

public class EmployeeDemo {
	private int empId;
    private String empName;
    private double salary;

    public EmployeeDemo(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + empId +
               ", Name : " + empName +
               ", Salary : " + salary;
    }

}
