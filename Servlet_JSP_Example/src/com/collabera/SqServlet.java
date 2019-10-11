package com.collabera;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		int k = (int) req.getAttribute("k"); // returns object of an object to be converted to integer via type casting
		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k");
		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		System.out.println("sq called");
	}
}
