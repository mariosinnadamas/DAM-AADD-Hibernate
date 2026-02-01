package ej51;

import ej62.clases.Departamentos;
import ej62.clases.Empleados;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class Ej3 {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            Empleados emp = em.find(Empleados.class,301);
            if (emp != null){
                BigDecimal salarioActual = emp.getSalario();
                //emp.setSalario(BigDecimal.valueOf(salarioActual*1.05));
            } else{
                System.out.println("El empleado no existe");
            }
            Departamentos dep = em.find(Departamentos.class,20);
            if (dep != null){
                //dep.setIdLocalizacion(4000);
            } else {
                System.out.println("El departamento no existe");
            }

            tx.commit();

            em.close();
            emf.close();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getCause() + " : " + e.getMessage());
        }
    }
}
