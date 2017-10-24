package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 24/10/2017.
 */

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager(1, "Artemis", "number?", 30000, "Engineering");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(40000, manager.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        manager.setName("Joanna");
        assertEquals("Joanna", manager.getName());
    }
}
