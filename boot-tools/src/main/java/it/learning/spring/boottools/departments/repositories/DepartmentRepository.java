package it.learning.spring.boottools.departments.repositories;

import it.learning.spring.boottools.departments.Department;

import java.util.List;

public interface DepartmentRepository {

    List<Department> getAll();

    Department getById(Long id);

    void add(Department department);

    void update(Department department);

    void delete(Long id);
}
