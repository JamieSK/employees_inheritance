package example.codeclan.com.employeestartpoint;

/**
 * Jamie's homework, 24/10/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee(int id, String name, String ssn, double salary) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name != "") {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
}
