package com.collabera;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);

//		req.setAttribute("k", k); // passing key value from user, then naming it k

		PrintWriter out = res.getWriter();
		out.println("Result is " + k);

/*		((HttpServletResponse) req).sendRedirect("sq?k=");
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
*/
	}
}
