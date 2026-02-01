package ej62.ej1;
import ej62.clases.Casa;
import ej62.clases.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("ejs621");

        EntityManager em = emf.createEntityManager();

        //Objeto del que vamos a convertir sus atributos
        Casa direccion = new Casa(
                "Calle Mayor 10",
                "Madrid",
                "28001"
        );

        //Objeto que será una tabla en la BD
        Persona persona = new Persona();
        persona.setDireccion(direccion);

        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();

        //Buscamos en la base de datos para imprimir
        Persona p = em.find(Persona.class, persona.getId());
        System.out.println(p.getDireccion().getCiudad());

        em.close();
        emf.close();
    }
}
