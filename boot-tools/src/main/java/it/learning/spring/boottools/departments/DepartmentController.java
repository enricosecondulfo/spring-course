package it.learning.spring.boottools.departments;

import it.learning.spring.boottools.departments.repositories.DepartmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    private DepartmentRepository userRepository;

    public DepartmentController(DepartmentRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Department> getAll() {
        return userRepository.getAll();
    }
}
