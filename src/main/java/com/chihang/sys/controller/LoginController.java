package com.chihang.sys.controller;

import com.chihang.sys.bean.UserInfo;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/loginUser")
    public Map<String, Object> login(String username, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("年龄", 180);
        UserInfo user=new UserInfo();
        user.setUserName(username);
        session.setAttribute("user",user);
        response.sendRedirect("/main.html");
        return map;
    }
}
