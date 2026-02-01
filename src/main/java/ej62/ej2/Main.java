package ej62.ej2;

import ej62.clases.Localizacione;
import ej62.clases.Paise;
import ej62.clases.Regione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("ejs62");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Regione region = new Regione(9999,"Europa");
        em.persist(region);
        Paise pais = new Paise("99", "España", region);
        em.persist(pais);
        Localizacione localizacion = new Localizacione(99999, "Calle de la Jara", "28240", "Madrid", "Madrid", pais);
        em.persist(localizacion);
        tx.commit();

        System.out.println(pais);
        System.out.println(localizacion);

        em.close();
        emf.close();
    }
}
