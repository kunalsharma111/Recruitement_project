/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
public class test {

    public static void main(String[] x){
        job j=new job();
       // cv c=null;
    //Emp e=null;
     // company c=null;
     Configuration cf=null;
     SessionFactory sf=null;
     Session session=null;
     
     try{
         cf=new Configuration();
         cf.configure("config/hibernate.cfg.xml");
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tf=session.beginTransaction();
         j =new job("Full Time","3 Months","Senior Hardware Engineer","Pune");
         session.save(j);
          j =new job("Full Time","5 Months","Java","banglore");
         session.save(j);
          j =new job("Full Time","Permanent","Front-End Developer","Hyderabad");
         session.save(j);
         j =new job("Full Time","1 Month","Back-End Developer","Noida");
         session.save(j);

         
        // e=new Emp("Kunal","Sharma","kunal123@gmail.com","Qwerty123");
        //  c=new cv("Nichi123@gmail.com","Kotkapura","8054671440","nichiket","Java,css,C","none","9.8","85","9","25/12/1998","male");
         //c=new company("Popy","popylak@gmail.com","www.popylak.com","9876543120","java","8","8.0","75%","7.5");
         
         tf.commit();
         
     }catch( Exception ee){
        ee.printStackTrace();
     }finally{
         session.close();
         sf.close();
     }
     System.out.println("Success");
    }
}
