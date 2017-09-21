/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 617702
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html; charset=UTF-8");
                
        String age = request.getParameter("age");
        String message = "";
        
        if(age == null )
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        else if( age.equals(""))
        {
            message = "You must give your current age ";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        else 
        {
     
            boolean valid = true;
            for(int index = 0; index < age.length() && valid; index++)
            {
                valid = Character.isDigit(age.charAt(index));
            }
            if(valid)
            {
                int nextAge = Integer.parseInt(age) + 1;
                message ="Your age next birthday will be " + nextAge;
            }
            else
            {
                message = "You must enter a number";
            }
            request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
        }
    }

}
