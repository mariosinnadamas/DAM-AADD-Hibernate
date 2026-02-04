package ej63.ej3;

import ej63.ej3.clases.Person;
import ej63.ej3.clases.Planet;
import ej63.ej3.clases.Species;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs633");
        EntityManager em = emf.createEntityManager();

        StarWarsDAOImpl dao = new StarWarsDAOImpl(em);

        /*Como puedo hacer que en este caso que la tabla humanos que tiene
        species_id se complete ese campo sin mapear la tabla species?
         */

        Person p = new Person();
        Planet tierra = em.find(Planet.class,1);
        Species humano = em.find(Species.class,1);
        p.setId(110);
        p.setName("Prueba");
        p.setGender("Male");
        p.setBirthYear("19BBY");
        p.setHeight((short) 172);
        p.setMass(77.0F);
        p.setHairColor("Black");
        p.setSkinColor("fair");
        p.setEyeColor("blue");
        p.setHomeworld(tierra);
        p.setSpecies(humano);
        //dao.crear_personaje(p);

        //Person p2 = dao.consultar_personaje(110);
        //System.out.println(p2.toString());

        /*Importante cargar el objeto de la base de datos antes de eliminarlo, porque si no para
        JPA es un POJO y no un elemento de la BBDD
         */
        //Person p3 = dao.consultar_personaje(110);
        //dao.eliminar_personaje(p3);

        System.out.println(dao.consulta_todos());

        em.close();
        emf.close();
    }
}
