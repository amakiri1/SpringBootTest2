package myPackage.boot.controller;/*
 *ClassName:EmpController
 *Package:myPackage.boot.controller
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/27-6:19
 *Version:v1.0
 */

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import myPackage.boot.pojo.Employee;
import myPackage.boot.service.impl.EmpServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    EmpServiceImpl empService;
    @ResponseBody
    @GetMapping("/emp")
    public List<Employee> testEmp(long eid){
        List<Employee> employees = empService.selectEmpList(eid);
        return employees;
    }
    @GetMapping("/data-list")
    public String empList(@RequestParam (value = "pn", defaultValue="1") int pn, Model model){
        Page<Employee> empPage = new Page<>(pn, 3);
        Page<Employee> page = empService.page(empPage);
        model.addAttribute("page",page);
        return "data-list";
    }
}
