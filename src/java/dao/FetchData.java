
package dao;

import model.Emp;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
              public boolean check(Emp original){
        Emp db=null;
        Configuration cf=new Configuration();
        cf.configure();
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        System.out.println(original.getFirst_name());
        session.save(original);
        tx.commit();
        session.close();
        sf.close();
       if(db==null){
          return false;
       }
       else{
        return original.equals(db);
       }
           }
    }
