package it.learning.spring.webmvc;

import it.learning.spring.webmvc.models.Employee;
import it.learning.spring.webmvc.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("employee")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        employee.setFirstName("Marco");
        employee.setLastName("Rossi");

        employeeRepository.add(employee);

        model.addAttribute("firstName", employee.getFirstName());
        model.addAttribute("lastName", employee.getLastName());

        return "employee";
    }
}
