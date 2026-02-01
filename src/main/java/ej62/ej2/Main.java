package ej62.ej2;

import ej62.clases.Localizaciones;
import ej62.clases.Paises;
import ej62.clases.Regiones;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/*
    No comprendo como ver el extremo de una relación que llamará a los toString de otros elementos.
    Al estar todas las tablas relacionadas entre si y al crearlas con JPA me crea linkedSet.
    No entiendo lo que son las referencias a crear las clases a través del JPA.
 */

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs622");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Regiones region = new Regiones(99999, "Europa");
        em.persist(region);
        Paises pais = new Paises("99", "España", region);
        em.persist(pais);
        Localizaciones localizacion = new Localizaciones(pais, "Calle de la Jara", "28240", "Madrid", "Madrid", 9999);
        em.persist(localizacion);
        tx.commit();

        System.out.println(pais);
        System.out.println(localizacion);
    }
}
