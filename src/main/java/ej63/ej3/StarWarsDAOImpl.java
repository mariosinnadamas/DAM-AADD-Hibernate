package ej63.ej3;

import ej63.ej3.clases.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class StarWarsDAOImpl implements StarWarsDAO{

    private EntityManager em;

    public StarWarsDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void crear_personaje(Person personaje) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(personaje);
        tx.commit();
    }

    @Override
    public Person consultar_personaje(int id_personaje) {
        return em.find(Person.class,id_personaje);
    }

    @Override
    public void actualizar_personaje(Person personaje_actualizado) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(personaje_actualizado);
        tx.commit();
    }

    @Override
    public void eliminar_personaje(Person personaje) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(personaje);
        tx.commit();
    }

    @Override
    public List<Person> consulta_todos() {
        return em.createQuery("FROM Person", Person.class).getResultList();
    }
}
