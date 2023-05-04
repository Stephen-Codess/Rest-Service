import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTests {

    @Test
    public void testAddEmployee() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee newEmployee = new Employee("4", "Steffan", "Christian", "steffan.christian@hp.com", "Product Manager");
        Employee addedEmployee = employeeManager.addEmployee(newEmployee);

        assertEquals(newEmployee, addedEmployee, "The added employee should be equal to the new employee");
    }

    @Test
    public void testGetEmployees() {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee newEmployee = new Employee("4", "Steffan", "Christian", "steffan.christian@hp.com", "Product Manager");
        employeeManager.addEmployee(newEmployee);

        int employeeCount = employeeManager.getEmployees().getEmployeeList().size();

        assertEquals(4, employeeCount, "The employee count should increase by 1 after adding a new employee");
    }
}
