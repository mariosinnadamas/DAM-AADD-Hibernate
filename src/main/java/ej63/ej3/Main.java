package ej63.ej3;

import ej63.ej3.clases.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs633");
        EntityManager em = emf.createEntityManager();

        StarWarsDAOImpl dao = new StarWarsDAOImpl(em);

        Person p = dao.consultar_personaje(1);
        System.out.println(p.toString());

        em.close();
        emf.close();
    }
}
