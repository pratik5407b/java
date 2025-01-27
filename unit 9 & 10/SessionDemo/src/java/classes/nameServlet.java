package classes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class nameServlet extends HttpServlet {

    // Process the request (you can leave it empty if no processing is required)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // You can remove the empty body if not needed
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String name = request.getParameter("name");
        String fullname = "My name is " + name;
        
        request.setAttribute("fullname", fullname);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ageServlet");
        dispatcher.forward(request, response);
        


       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
