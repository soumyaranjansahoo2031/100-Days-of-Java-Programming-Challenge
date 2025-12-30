package org.example;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;

public class JpaDemoMain {
    public static void main(String[] args){
        EntityManager em = JpaUtil.getEntityManager();
        try{
            UserClassHibernate user = new UserClassHibernate("Charlie");
//            session.beginTransaction();
            em.getTransaction().begin();
//            session.persist(user);
            em.persist(user);
//            session.getTransaction().commit();
            em.getTransaction().commit();
            System.out.println("User saved: "+user.getId());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            em.close();
            JpaUtil.close();
        }
    }
}
