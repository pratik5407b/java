/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cva Ptk
 */
public class NewServlet extends HttpServlet {
 private static final String username="root";
    private static final String password="";
    private static final String url="jdbc:mysql://localhost:3306/bcis";

     List<String[]> dataList = new ArrayList<>();

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection con = DriverManager.getConnection(url,username,password);

        String query="select * from  student";

        PreparedStatement ps = con.prepareStatement(query);
          ResultSet rs = null;
          rs =ps.executeQuery();
           
             while (rs.next()) {
                String name = rs.getString("name");
                
                
                
                String dob = rs.getString("dob");
               dataList.add(new String[]{name, dob});  
             }
        con.close();
        }catch (SQLException ex) {
              PrintWriter out= response.getWriter();
            ex.printStackTrace();
            out.print("Error of Database:"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
              PrintWriter out= response.getWriter();
            ex.printStackTrace();
              out.print("Error of Class Driver:"+ex.getMessage());
        }
         request.setAttribute("dataList", dataList);
          RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
