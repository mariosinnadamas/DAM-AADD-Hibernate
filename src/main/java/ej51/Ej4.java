package ej51;

import ej51.clases.Departamentos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class Ej4 {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            //Puedo hacer una consulta para sacar el nombre del departamento?

//            Departamentos dep = em.find(Departamentos.class,60);
//            Long numEmpleados = em.createQuery(
//                    "SELECT COUNT(e) from Empleados e WHERE e.id_departamento = :id",Long.class
//            ).setParameter("id",dep.getId_departamento()).getSingleResult();
//
//            if (numEmpleados == 0) {
//                em.remove(dep);
//            } else {
//                System.out.println("No se puede eliminar: tiene empleados asociados");
//            }

            //Este si que se ha podido eliminar, porque no tenia ningun empleado asociado a él
            Departamentos dep = em.find(Departamentos.class,80);

            if (dep != null){
                em.remove(dep);
            }

            tx.commit();

            em.close();
            emf.close();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getCause() + " : " + e.getMessage());
        }
    }
}
