package myPackage.boot.servletComponent;/*
 *ClassName:MyServlet
 *Package:myPackage.boot.servlet
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/26-5:23
 *Version:v1.0
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("hello");
    }
}
