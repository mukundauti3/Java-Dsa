package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet(description = "Validate it with DataBase User is valid or not", urlPatterns = { "/CheckValidLogin" })
public class CheckValidLogin extends HttpServlet {
	
	static ProductService pService=new ProductServiceImpl();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out =resp.getWriter();
			String uname=req.getParameter("uname");
			String pass=req.getParameter("pass");
			
			MyUser user=pService.checkUser(uname,pass);
			
	}

}
