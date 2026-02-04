package ej71.ej1;

import ej63.ej3.clases.Person;
import jakarta.persistence.*;

import java.util.List;

/*
    En el proyecto de Star Wars obtén:
    -
    -
    - El número de personajes de cada especie.
    - El nombre de cada nave y el número de personajes que la pilotan, ordenadas de la que pilotan más a la que
        pilotan menos personajes.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs633");
        EntityManager em = emf.createEntityManager();
        /*
        Todos los personajes. Muéstralos con su toString() y comprueba si aparecen
        los planetas y naves relacionados con ellos.
         */
        /*
        TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> personajes = query.getResultList();

        for (Person p : personajes){
            System.out.println(p.toString_conTodo());
        }
         */

        /*
        Aquellos personajes que pertenezcan a planetas cuyo nombre empiece por C.
         */
        TypedQuery<Person> query1 = em.createQuery("SELECT p FROM Person p WHERE name LIKE 'C%'", Person.class);
        List<Person> person_empiezan_c = query1.getResultList();
        for (Person p : person_empiezan_c){
            System.out.println(p.toString());
        }

    }
}
