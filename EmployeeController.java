import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employees")


public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController() {
        this.employeeManager = new EmployeeManager();
    }

    @GetMapping
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee newEmployee) {
        employeeManager.getEmployees().getEmployeeList().add(newEmployee);
        return newEmployee;
    }

}
