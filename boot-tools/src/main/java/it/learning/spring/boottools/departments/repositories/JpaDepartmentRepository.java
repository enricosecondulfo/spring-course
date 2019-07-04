package it.learning.spring.boottools.departments.repositories;

import it.learning.spring.boottools.departments.Department;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("prod")
public class JpaDepartmentRepository implements DepartmentRepository {

    @Override
    public List<Department> getAll() {
        System.out.println("jpa");

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
