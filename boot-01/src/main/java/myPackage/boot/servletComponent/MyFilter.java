package myPackage.boot.servletComponent;/*
 *ClassName:MyFilter
 *Package:myPackage.boot.servletComponent
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/26-5:32
 *Version:v1.0
 */

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = "/myServlet")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter");
        chain.doFilter(request, response);
    }
}
