package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 24/10/2017.
 */

public class AdminTest {
    Admin admin;

    @Before
    public void before() {
        admin = new Admin(1, "Jeff", "Sociable", 12000);
    }

    @Test
    public void canGetSsn() {
        assertEquals("Sociable", admin.getSocialSecurityNumber());
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(2000);
        assertEquals(14000, admin.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        admin.setName("Joanna");
        assertEquals("Joanna", admin.getName());
    }
}
