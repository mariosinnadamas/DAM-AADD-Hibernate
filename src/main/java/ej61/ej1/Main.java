package ej61.ej1;

import ej61.clases.Categoria;
import ej61.clases.Pieza;
import ej61.clases.Proveedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs61");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Proveedor p  = new Proveedor();
            p.setNombre("Prueba");
            p.setCiudad("Madrid");
            p.setProvincia("Madrid");
            p.setTelefono("123456789");

            em.persist(p);

            Pieza pieza = new Pieza();
            pieza.setNombre("Pieza1");
            pieza.setColor("Blanco");
            pieza.setPrecio(10.0);
            em.persist(pieza);

            Categoria categoria = new Categoria();
            categoria.setNombre("Nueva");
            em.persist(categoria);
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
