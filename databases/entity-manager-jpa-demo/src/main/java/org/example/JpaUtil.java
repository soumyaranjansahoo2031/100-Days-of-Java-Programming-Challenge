package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.cfg.Configuration;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static{
        emf = Persistence.createEntityManagerFactory("myJpaUnit");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static void close(){
        emf.close();
    }
}
