package myPackage.boot.controller;/*
 *ClassName:HelloController
 *Package:myPackage.boot.controller
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/24-4:23
 *Version:v1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handler01(){
        return "hello,spring boot2";
    }
}
