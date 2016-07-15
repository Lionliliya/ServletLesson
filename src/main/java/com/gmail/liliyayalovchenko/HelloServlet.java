package com.gmail.liliyayalovchenko;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by maximars on 14.07.2016.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(request, response);

    }

    private void getResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String title = "Using + " + request.getMethod() + " to read form data";
        String doctype = "<!DOCTYPE html>";
        out.println(doctype);
        out.println("<html>");
        out.println("<head><title> " + title + " </title></head>");
        out.println("<body>");
        out.println("<h1>Title: " + title + " </h1>");
        out.println(request.getParameter("first_name") + " " + request.getParameter("last_name"));
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       getResponse(request, response);
    }
}
