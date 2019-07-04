package it.learning.spring.boottools.departments.repositories;

import it.learning.spring.boottools.departments.Department;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Profile("dev")
public class InMemoryDepartmentRepository implements DepartmentRepository {

    @Override
    public List<Department> getAll() {
        System.out.println("in memory");
        return null;
    }

    @Override
    public Department getById(Long id) {
        return null;
    }

    @Override
    public void add(Department department) {

    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Long id) {

    }
}
