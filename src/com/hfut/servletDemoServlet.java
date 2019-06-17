package com.hfut;

import com.hfut.pojo.People;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class servletDemoServlet extends HttpServlet {
    private People people;
    private People people2;

    @Override
    public void init(ServletConfig config) throws ServletException {
        WebApplicationContext wac= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        people=wac.getBean("peo",People.class);
        people2=wac.getBean("peo",People.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
