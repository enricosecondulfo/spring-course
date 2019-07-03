package it.learning.spring.webmvc.repositories;

import it.learning.spring.webmvc.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    private Map<Long, Employee> employees = new HashMap<>();

    public Long index = 0L;

    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee getById(Long id) {
        return employees.get(id);
    }

    public void add(Employee employee) {
        employee.setId(++index);
        employees.put(employee.getId(), employee);
    }

    public void update(Employee user) {
        if (employees.containsKey(user.getId())) {
            employees.put(user.getId(), user);
        }
    }

    public void delete(Long id) {
        employees.remove(id);
    }

}
