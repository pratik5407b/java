/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



/**
 *
 * @author lenovo
 */
public class LifeCycleServlet extends HttpServlet {

  

     public void init(ServletConfig servletconfig) throws ServletException{
         
     }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       response.setContentType("text/html");
       PrintWriter pw=response.getWriter();
       pw.println("<h1>Welcome To Servlet !</h1>");
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
