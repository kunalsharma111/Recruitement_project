package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ye=request.getParameter("ye");
       String pw=request.getParameter("pw");
       if(Validate.checkuser(ye,pw)){
            System.out.println("username or password correct");
           RequestDispatcher rs=request.getRequestDispatcher("index.jsp");
           rs.forward(request,response);
           }
              else{
           System.out.println("username or password incorrect");
           RequestDispatcher rs=request.getRequestDispatcher("index_1.html");
           rs.include(request,response);    
       }
    }

}
