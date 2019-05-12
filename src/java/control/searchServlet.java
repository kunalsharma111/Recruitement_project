/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.job;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
@WebServlet(name = "searchServlet", urlPatterns = {"/searchServlet"})
public class searchServlet extends HttpServlet {

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
        
         Query query=session.createQuery("from job");
        List<job> records = query.list();
        
        String find1=request.getParameter("t1");
        String find2=request.getParameter("t2");
        if((find1!=null && !find1.isEmpty())||(find2!=null && !find2.isEmpty())){ 
         request.setAttribute("find1", find1);
         request.setAttribute("find2", find2);
        request.setAttribute("List", records);
        }
        else{
            request.setAttribute("List1",records);
        }
        
       RequestDispatcher rd= request.getRequestDispatcher("show_jobs.jsp");
       rd.forward(request,response);
        
        
 
    }

    
}
