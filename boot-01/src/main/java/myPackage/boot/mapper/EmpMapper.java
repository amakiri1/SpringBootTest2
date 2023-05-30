package myPackage.boot.mapper;/*
 *ClassName:EmpMapper
 *Package:myPackage.boot.mapper
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/27-6:10
 *Version:v1.0
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import myPackage.boot.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface EmpMapper extends BaseMapper<Employee> {
    public Employee selectEmpById(@Param("eid") long eid);
}
