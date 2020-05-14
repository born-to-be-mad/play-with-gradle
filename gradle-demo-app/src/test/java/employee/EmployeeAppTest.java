package employee;

import employee.Employee;
import org.junit.*;
import static org.junit.Assert.*;

public class EmployeeAppTest {
 
    @Test
    public void testData() {
 
        Employee testEmp = this.getEmployeeTest();
        assertEquals(testEmp.name, "James");
        assertEquals(testEmp.emailAddress, "james@bond.com");
        assertEquals(testEmp.yearOfBirth, 1975);
    }
 
    private Employee getEmployeeTest() {
 
        Employee employee = new Employee();
        employee.name = "James";
        employee.emailAddress = "james@bond.com";
        employee.yearOfBirth = 1975;
 
        return employee;
    }
}