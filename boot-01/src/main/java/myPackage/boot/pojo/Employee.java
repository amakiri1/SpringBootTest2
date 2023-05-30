package myPackage.boot.pojo;/*
 *ClassName:employee
 *Package:DAOemp
 *Description:
 *@Author: Mr Wang
 *@Create:2023/4/16-13:28
 *Version:v1.0
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;
@TableName("employee")
public class Employee {
    @TableId(value = "eid",type = IdType.AUTO)
    long eid;
    String empName;
    Date hireDate;
    int money;

    public Employee(long eid, String empName, Date hireDate, int money) {
        this.eid = eid;
        this.empName = empName;
        this.hireDate = hireDate;
        this.money = money;
    }

    public Employee() {
    }

    public long getEid() {
        return eid;
    }

    public void setEid(long eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
