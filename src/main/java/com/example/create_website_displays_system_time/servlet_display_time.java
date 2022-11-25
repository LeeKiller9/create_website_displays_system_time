package com.example.create_website_displays_system_time;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "create_website_displays_system_time", value = "/servlet_displays_time")
public class servlet_display_time extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date today = new Date();

        writer.println("<h1>" + today + "</h1>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
