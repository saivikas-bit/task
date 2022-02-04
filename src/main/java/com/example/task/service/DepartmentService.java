package com.example.task.service;

import com.example.task.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartments();

    Department getDepartmentById(Long id);

    void deleteDepartment(Long deptId);

    Department updateDepartment(Long deptId, Department department);

    Department fetchDepartmentName(String deptName);
}
