/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbconnection;

import Model.PsycoTest;
import dao.PsycoDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class Test1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        PrintWriter out = response.getWriter();
        try   {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Test1</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Test1 at " + request.getContextPath() + "</h1>");
//            try   {
                int age,engnat,gender,hand;
            age=Integer.parseInt(request.getParameter("age"));
            engnat=Integer.parseInt(request.getParameter("engnat"));
            gender=Integer.parseInt(request.getParameter("gender"));
            hand=Integer.parseInt(request.getParameter("hand"));
            int answer=Integer.parseInt(request.getParameter("refBgId"));
             
                     // System.out.println("hey yash here C++ ndkjsvnvnsdkvnjsk");
             PsycoTest pt =new PsycoTest();
             pt.setAge(age);
            pt.setEngnat(engnat);
            pt.setGender(gender);
            pt.setHand(hand);
            
             PsycoDao pd =new PsycoDao();
             if(pd.Insert(pt))
                 response.sendRedirect("test2.jsp");
            else
                 response.sendRedirect("index.html"); 
//            out.println("</body>");
//            out.println("</html>");
        }
        catch(Exception e)
        {
           out.println(e);
        } 
    
            out.println("</body>");
            out.println("</html>");
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
