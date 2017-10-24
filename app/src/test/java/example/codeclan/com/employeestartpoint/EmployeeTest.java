package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;

    @Before
    public void before() {
        employee = new Employee(1, "Jo", "Social", 12000);
    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(2000);
        assertEquals(14000, employee.getSalary(), 0.1);
    }

    @Test
    public void cannotLowerSalary() {
        employee.raiseSalary(-2000);
        assertEquals(12000, employee.getSalary(), 0.1);
    }

    @Test
    public void cannotSetNameToNull() {
        employee.setName(null);
        assertEquals("Jo", employee.getName());

    }
}
