package com.chihang.interceptor;

import com.chihang.sys.bean.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfo user = (UserInfo) request.getSession().getAttribute("user");
        if (user == null) {
            System.out.println("asdasdasd");
            System.out.println(request.getContextPath().toString());
            response.sendRedirect(request.getContextPath()+"/index.html");
            return false;
        }
        return true;
    }
}
