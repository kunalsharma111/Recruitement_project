
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
        public static boolean checkuser(String ye,String pw){
        boolean st=false;
        try{ 
            
        String jdbcurl="jdbc:mysql://localhost:3306/rec?useSSL=false";
        String user="root";
        String pass="kunal123@";
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("connection establishing");
        Connection con=DriverManager.getConnection(jdbcurl,user,pass);
        PreparedStatement ps=con.prepareStatement("select * from Emp where your_email=? and password=? ");
        ps.setString(1,ye);
        ps.setString(2,pw);
        ResultSet rs=ps.executeQuery();
        st=rs.next();
    }catch(Exception e){
        e.printStackTrace();
    }
        return st;
    }
}
