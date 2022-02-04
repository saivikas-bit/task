package com.example.task.controller;

import com.example.task.entity.Department;
import com.example.task.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartments(){
      return departmentService.fetchDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable("id") Long deptId){
        departmentService.deleteDepartment(deptId);
        return "Deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id")Long deptId,@RequestBody Department department){
        return departmentService.updateDepartment(deptId,department);
    }
    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String deptName){
        return departmentService.fetchDepartmentName(deptName);
    }

}
