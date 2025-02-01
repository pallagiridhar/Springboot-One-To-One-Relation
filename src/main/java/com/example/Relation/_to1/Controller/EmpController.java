package com.example.Relation._to1.Controller;


import com.example.Relation._to1.Entity.Employee;
import com.example.Relation._to1.Service.EmployeeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController
{
    @Autowired
    private EmployeeSer employeeSer;
    @PostMapping("/insert")
    public Employee saveEmployee(@RequestBody Employee e)
    {
        return employeeSer.saveEmp(e);
    }
    @GetMapping ("/read")
    public List<Employee> getData()
    {
        return employeeSer.readAll();
    }
    @GetMapping("/fetch/{empId}")
    public Employee getAllData(@PathVariable int empId)
    {
        return employeeSer.getData(empId);
    }
}
