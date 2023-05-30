package myPackage.boot.servletComponent;/*
 *ClassName:MyListener
 *Package:myPackage.boot.servletComponent
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/26-5:39
 *Version:v1.0
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化中...");
    }
}
