package com.springboot.actuator.dashboard.service;

import com.springboot.actuator.dashboard.exception.UserNotFoundException;
import com.springboot.actuator.dashboard.model.Employee;
import com.springboot.actuator.dashboard.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeKeyId(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id).orElseThrow(
                () -> new UserNotFoundException("User with id " + id + " was not found")
        );
    }

    @Transactional
    public void deleteEmployee(Long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
