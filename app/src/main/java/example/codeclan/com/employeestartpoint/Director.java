package example.codeclan.com.employeestartpoint;

import example.codeclan.com.employeestartpoint.Manager;

/**
 * Created by jamie on 24/10/2017.
 */

public class Director extends Manager {
    private double budget;

    public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
        super(id, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
