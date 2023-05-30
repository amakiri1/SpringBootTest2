package myPackage.boot.service.impl;/*
 *ClassName:EmpService
 *Package:myPackage.boot.service
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/27-6:17
 *Version:v1.0
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import myPackage.boot.mapper.EmpMapper;
import myPackage.boot.pojo.Employee;
import myPackage.boot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper,Employee> implements EmpService {
    @Autowired
    EmpMapper empMapper;
    public Employee selectEmpById(long eid){
        Employee employee = empMapper.selectEmpById(eid);
        return employee;
    }
    public List<Employee> selectEmpList(long eid){
        QueryWrapper<Employee> employeeQueryWrapper = new QueryWrapper<>();
        employeeQueryWrapper.eq("eid",1);
        List<Employee> employees = empMapper.selectList(employeeQueryWrapper);
        return employees;
    }
}
