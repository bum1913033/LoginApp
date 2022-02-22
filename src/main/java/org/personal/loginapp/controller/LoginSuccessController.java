package org.personal.loginapp.controller;

import org.personal.loginapp.dao.LoginDao;
import org.personal.loginapp.dao.impl.LoginDaoImpl;
import org.personal.loginapp.model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "LoginSuccessController" , urlPatterns= {"/dashboard"})
public class LoginSuccessController extends HttpServlet {
    private final LoginDao loginDao = new LoginDaoImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Login login = new Login();

        req.getRequestDispatcher("/loginSuccess.jsp").forward(req,resp);
    }
}
