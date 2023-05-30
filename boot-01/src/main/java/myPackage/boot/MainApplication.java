package myPackage.boot;/*
 *ClassName:MainApplication
 *Package:myPackage.boot
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/24-4:19
 *Version:v1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "myPackage/boot/servletComponent")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
