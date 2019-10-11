package com.collabera;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* specifies where the user goes when accessing this URL */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class MyServlet extends HttpServlet {
	public static final long serialVersionID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException {

		res.setContentType("text/html"); // setting the content type

    	// read form fields
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);

        // do some processing here...

        // get response writer stream to write data
        PrintWriter out = res.getWriter();

        // build HTML code
        String htmlResponse = "<title>";
        htmlResponse += "Spooky Skeleton October!";
        htmlResponse += "</title>";
        htmlResponse += "<html><body>";
        htmlResponse += "<h2>Your username is: " + username + "<br/>";      
        htmlResponse += "Your password is: " + password + "</h2>";    
        htmlResponse += "</body></html>";

        // return response
        out.println(htmlResponse);

        out.close(); // close PrintWriter stream
	}
}

//out.print("Hi<br>");
//
///* Interfaces ServletConfig and ServletContext */
//ServletContext ctx = getServletContext();
//String str = ctx.getInitParameter("name");
//out.println(str);
