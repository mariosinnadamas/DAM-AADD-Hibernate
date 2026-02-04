package ej71.ej1;

import ej63.ej3.clases.Person;
import jakarta.persistence.*;

import java.util.List;

/*
    En el proyecto de Star Wars obtén:
    - Todos los personajes. Muéstralos con su toString() y comprueba si aparecen
        los planetas y naves relacionados con ellos.
    - Aquellos personajes que pertenezcan a planetas cuyo nombre empiece por C.
    - El número de personajes de cada especie.
    - El nombre de cada nave y el número de personajes que la pilotan, ordenadas de la que pilotan más a la que
        pilotan menos personajes.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs633");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> personajes = query.getResultList();

        for (Person p : personajes){
            System.out.println(p.toString_conTodo());
        }
    }
}
