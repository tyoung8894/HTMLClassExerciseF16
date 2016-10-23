/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tyoung12  
 */
@WebServlet(urlPatterns = {"/goelon"})
public class HalloweenServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/subscribe.html";
        
        String action = request.getParameter("action");
        //System.out.println("HalloweenServlet action: " + action);
        //log("action=" + action);
        
        if (action.equals("add")){
            
       String firstName = request.getParameter("Firstname");
       String lastName = request.getParameter("Lastname");
       String email = request.getParameter("email");
       String zipCode = request.getParameter("Zip");
       System.out.println(firstName + lastName + email + zipCode);
       getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
       
    }
        else {
            url = "/index.html";
        }
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
        
        
     

}