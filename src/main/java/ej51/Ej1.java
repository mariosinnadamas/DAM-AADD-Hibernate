package ej51;

import ej62.clases.Departamentos;
import ej62.clases.Localizaciones;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Ej1 {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf =
                    Persistence.createEntityManagerFactory("default");

            EntityManager em =
                    emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();

            tx.begin();

            Localizaciones loc = new Localizaciones();
            Departamentos dep = new Departamentos();
            Departamentos dep2 = new Departamentos();
            Departamentos dep3 = new Departamentos();

            /*
            //Añadimos los datos y los guardamos
            loc.setId(1);
            loc.setCodigoPostal("28411");
            loc.setCiudad("Moralzarzal");
            loc.setProvincia("Madrid");
            //loc.setIdPais("ES");

            //Cada uno de los departamentos deben estar referenciados a un director por su relación con empleado
            dep.setId(1);
            dep.setNombreDepartamento("prueba1");
            dep.setIdDirector(702);
            dep.setIdLocalizacion(1);

            dep2.setId_departamento(2);
            dep2.setNombre_departamento("prueba2");
            dep2.setId_director(702);
            dep2.setId_localizacion(1);

            dep3.setId_departamento(3);
            dep3.setNombre_departamento("prueba3");
            dep3.setId_director(702);
            dep3.setId_localizacion(1);

            //Añade el objeto a la tabla
            em.persist(loc);
            em.persist(dep);
            em.persist(dep2);
            em.persist(dep3);
            */

            //Commitea
            tx.commit();

            //Cerramos los Entity
            em.close();
            emf.close();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getCause() + " : " + e.getMessage());
        }
    }
}
