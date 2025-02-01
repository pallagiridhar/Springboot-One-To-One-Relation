package com.example.Relation._to1.Service;


import com.example.Relation._to1.Entity.Employee;
import com.example.Relation._to1.Repository.AddressRepo;
import com.example.Relation._to1.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSer
{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AddressRepo addressRepo;

    public Employee saveEmp(Employee emp)
    {
        return employeeRepo.save(emp);
    }
    public List<Employee> readAll()
    {
        return employeeRepo.findAll();
    }
    public Employee getData(int empId)
    {
        return employeeRepo.findById(empId).orElse(null);
    }
}
