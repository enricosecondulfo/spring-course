package it.learning.spring.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping
    public ResponseEntity<Collection<Department>> getAll() {
        List<Department> departments = new ArrayList<>();

        Department department = new Department();
        department.setName("department");

        departments.add(department);

        return ResponseEntity.badRequest().build();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Department> getById(@PathVariable Long id) {
        Map<Long, Department> departments = new HashMap<>();

        Department department = new Department();
        department.setId(1L);
        department.setName("department");
        departments.put(department.getId(), department);

        if (!departments.containsKey(id)) {
            return ResponseEntity.notFound().build();

        }else {
            return ResponseEntity.ok(departments.get(id));
        }
    }

    @PostMapping
    public Department add(@RequestBody Department department) {
        Map<Long, Department> departments = new HashMap<>();
        departments.put(1L, department);

        return departments.get(1L);
    }

    @PutMapping
    public Department update(@RequestBody Department department) {
        Map<Long, Department> departments = new HashMap<>();
        Department existingDepartment = new Department();
        existingDepartment.setId(1L);
        existingDepartment.setName("IT");
        departments.put(existingDepartment.getId(), existingDepartment);

        departments.put(department.getId(), department);
        return departments.get(department.getId());
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        Map<Long, Department> departments = new HashMap<>();
        Department existingDepartment = new Department();
        existingDepartment.setId(1L);
        existingDepartment.setName("IT");

        departments.remove(id);
    }
}

