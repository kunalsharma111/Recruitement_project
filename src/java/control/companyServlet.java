/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
@WebServlet(name = "companyServlet", urlPatterns = {"/companyServlet"})
public class companyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String name=request.getParameter("cn");
         String website=request.getParameter("cw");
         String phno=request.getParameter("cno");
         String email=request.getParameter("em");
         String r_s=request.getParameter("R_s");
         String emp=request.getParameter("ew");
         String ten=request.getParameter("ten");
         String twelve=request.getParameter("twelve");
         String be=request.getParameter("bt");
         String join_before=request.getParameter("dob");
 

         Configuration cf=new Configuration();
         cf.configure("config/hibernate.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
         company c=new company(name,email,website,phno,r_s,emp,ten,twelve,be);
        c.setName(name);
         session.save(c);
         tf.commit();
         session.close();
         sf.close();
         
               RequestDispatcher rd= request.getRequestDispatcher("company_add.html");
               rd.forward(request,response);
         
        
    }

    
}
