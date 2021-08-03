package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ajaxServlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println(name);
		resp.setCharacterEncoding("utf-8");
		PrintWriter  p   =resp.getWriter();
		p.write("返回的数据");
		p.flush();
		p.close();
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
				
}
