package control;

import dao.FetchData;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet(name = "Savesign", urlPatterns = {"/Savesign"})
public class Savesign extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            Configuration cf=new Configuration();
        cf.configure("config/hibernate.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
            System.out.println(request.getParameter("first_name"));
            String first_name=request.getParameter("first_name");
	    String last_name=request.getParameter("last_name");
	    String your_email=request.getParameter("your_email");
	    String password=request.getParameter("password");
            Emp e=(Emp)session.get(Emp.class,your_email);
            if(e==null){
           e=new Emp(first_name,last_name,your_email,password);
               /* e.setFirst_name(first_name);
            e.setLast_name(last_name);
            e.setYour_email(your_email);
            e.setPassword(password);*/
            System.out.println(e.getFirst_name());
             session.save(e);
        
            }
        tx.commit();
        session.close();
        sf.close();
            
            response.sendRedirect("indexx.jsp");
}
}
