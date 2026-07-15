package collections;

public class EmployeeSalary {
	private int id;
    private String name;
    private double salary;

    public EmployeeSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
