package com.example.task.service;

import com.example.task.entity.Department;
import com.example.task.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartment(Long deptId) {
         departmentRepository.deleteById(deptId);
    }

    @Override
    public Department updateDepartment(Long deptId, Department department) {
        var dbDept=departmentRepository.findById(deptId).get();
        if(Objects.nonNull(department.getDepartmentName())&&!"".equalsIgnoreCase(department.getDepartmentName())){
            dbDept.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress())&&!"".equalsIgnoreCase(department.getDepartmentAddress())){
            dbDept.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode())&&!"".equalsIgnoreCase(department.getDepartmentCode())){
            dbDept.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(dbDept);
    }

    @Override
    public Department fetchDepartmentName(String deptName) {
        return departmentRepository.findByDepartmentName(deptName);
    }

}
