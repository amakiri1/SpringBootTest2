package myPackage.boot.interceptor;/*
 *ClassName:LoginInterceptor
 *Package:myPackage.boot.interceptor
 *Description:
 *@Author: Mr Wang
 *@Create:2023/5/25-12:49
 *Version:v1.0
 */

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if(1==1){
            return true;
        }else {
            response.sendRedirect("/");
            return false;
        }
    }
}
