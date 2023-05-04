




public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.getEmployeeList().add(new Employee("1", "Stephen", "Christopher", "stephen.christopher@hp.com", "JavaApprentice"));
        employees.getEmployeeList().add(new Employee("2", "Christopher", "Stephens", "christopher.stephens@hp.com", "SoftwareEngineer"));
        employees.getEmployeeList().add(new Employee("3", "Steffen", "Kristopher", "steffen.kristopher@hp.com", "SrSoftwareEngineer"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public Employee addEmployee(Employee newEmployee) {
        employees.getEmployeeList().add(newEmployee);
        return newEmployee;
    }
}
