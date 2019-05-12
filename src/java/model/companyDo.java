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
public class companyDo {
    public static void save(String a,String b,String c,String d,String e,String f,String g,String h,String i)
    {
     Configuration cf=new Configuration();
         cf.configure("config/hibernate.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
         company c1=new company(a,b,c,d,e,f,g,h,i);
         session.save(c1);
         tf.commit();
         session.close();
         sf.close();
    }
   public static void main(String args[])
   {
    companyDo.save("alok","dhsjs","dhfd","sigrh","sshgjkk","iijgs","kfgf","dsnfj","sjdjnsj"); 
   }
}
