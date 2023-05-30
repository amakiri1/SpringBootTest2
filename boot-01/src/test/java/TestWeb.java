import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import myPackage.boot.mapper.EmpMapper;
import myPackage.boot.pojo.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
public class TestWeb {
    @Autowired
    EmpMapper empMapper;
    @Autowired
    DataSource dataSource;
    @Test
    public void testMapper(){
        String name = dataSource.getClass().getName();
        System.out.println(name);
        QueryWrapper<Employee> employeeQueryWrapper = new QueryWrapper<>();
        employeeQueryWrapper.eq("id",1);
        List<Employee> employees = empMapper.selectList(employeeQueryWrapper);
        employees.forEach(employee -> System.out.println(employee));
    }
}
