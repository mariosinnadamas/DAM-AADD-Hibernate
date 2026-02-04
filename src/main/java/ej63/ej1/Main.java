package ej63.ej1;

import ej63.ej1.clases.Departamentos;
import ej63.ej1.clases.Local_depar;
import ej63.ej1.clases.Localizaciones;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Crea en un proyecto la estructura resultante de transformar la relación N:M que
 * se muestra en la figura 6.7.
 *
 * Obersvaciones:
 * Las relaciones N:M por lo visto se convierten siempre en una relación 1:N con una tabla intermedia.
 *
 * Por tanto el diseño quedaría así:
 * Localizaciones 1 ────< Local_depar >──── 1 Departamentos
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs63");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //Creo localizaciones
        Localizaciones loc1 = new Localizaciones();
        loc1.setDireccion("Calle Mayor 1");
        loc1.setCodigo_postal("28001");
        loc1.setCiudad("Madrid");
        loc1.setProvincia("Madrid");

        Localizaciones loc2 = new Localizaciones();
        loc2.setDireccion("Gran Via 10");
        loc2.setCodigo_postal("08001");
        loc2.setCiudad("Barcelona");
        loc2.setProvincia("Barcelona");

        //Subo las localizaciones
        em.persist(loc1);
        em.persist(loc2);

        //Creo departamentos
        Departamentos dep1 = new Departamentos();
        dep1.setNombre_departamento("Ventas");
        dep1.setId_director(100);

        Departamentos dep2 = new Departamentos();
        dep2.setNombre_departamento("I+T");
        dep2.setId_director(200);

        //Los subo
        em.persist(dep1);
        em.persist(dep2);

        //Creo relaciones de la tabla intermedia
        Local_depar r1 = new Local_depar();
        r1.setLocalizacion(loc1);
        r1.setDepartamento(dep1);

        Local_depar r2 = new Local_depar();
        r2.setLocalizacion(loc1);
        r2.setDepartamento(dep2);

        Local_depar r3 = new Local_depar();
        r3.setLocalizacion(loc2);
        r3.setDepartamento(dep2);

        em.persist(r1);
        em.persist(r2);
        em.persist(r3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
