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
import model.cv;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
@WebServlet(name = "cvServlet", urlPatterns = {"/cvServlet"})
public class cvServlet extends HttpServlet {

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
        
         Configuration cf=new Configuration();
         cf.configure("config/hibernate.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
        
         String name=request.getParameter("name1");
         String from=request.getParameter("from");
         String phno=request.getParameter("phno");
         String email=request.getParameter("email");
         String k_s=request.getParameter("k_s");
         String pre=request.getParameter("pre1");
         String ten=request.getParameter("ten");
         String twelve=request.getParameter("twelve");
         String be=request.getParameter("bt");
         String dob=request.getParameter("dob");
         String g=request.getParameter("g");
         cv c=null;
         //c=(cv)session.get(cv.class, email);
         //if(c==null){
               c=new cv(email,from,phno,name,k_s,pre,twelve,ten,be,dob,g);
               session.save(c);
         //}


         tf.commit();
         session.close();
         sf.close();
                  RequestDispatcher rd= request.getRequestDispatcher("cv_apply.html");
               rd.forward(request,response);
    }

    

}
