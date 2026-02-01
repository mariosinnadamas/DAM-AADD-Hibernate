package ej51;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Ej2 {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();
/*
            Empleados emp = new Empleados();
            Empleados emp2 = new Empleados();
            Empleados emp3 = new Empleados();
            Empleados emp4 = new Empleados();
            Empleados emp5 = new Empleados();

            emp.setId_empleado(1);
            emp.setNombre("Empleado1");
            emp.setApellido("Empleadez1");
            emp.setEmail("correo1@scott.com");
            emp.setFecha_contratacion(LocalDate.of(1995,11,11));
            emp.setId_trabajo("AC_ACCOUNT");
            emp.setSalario(8400);
            emp.setId_director(702);
            emp.setId_departamento(1);

            emp2.setId_empleado(2);
            emp2.setNombre("Empleado2");
            emp2.setApellido("Empleadez2");
            emp2.setEmail("correo2@scott.com");
            emp2.setFecha_contratacion(LocalDate.of(1995,11,11));
            emp2.setId_trabajo("AC_ACCOUNT");
            emp2.setSalario(8400);
            emp2.setId_director(702);
            emp2.setId_departamento(1);

            emp3.setId_empleado(3);
            emp3.setNombre("Empleado3");
            emp3.setApellido("Empleadez3");
            emp3.setEmail("correo3@scott.com");
            emp3.setFecha_contratacion(LocalDate.of(1995,11,11));
            emp3.setId_trabajo("AC_ACCOUNT");
            emp3.setSalario(8400);
            emp3.setId_director(702);
            emp3.setId_departamento(2);

            emp4.setId_empleado(4);
            emp4.setNombre("Empleado4");
            emp4.setApellido("Empleadez4");
            emp4.setEmail("correo4@scott.com");
            emp4.setFecha_contratacion(LocalDate.of(1995,11,11));
            emp4.setId_trabajo("AC_ACCOUNT");
            emp4.setSalario(8400);
            emp4.setId_director(702);
            emp4.setId_departamento(2);

            emp5.setId_empleado(5);
            emp5.setNombre("Empleado5");
            emp5.setApellido("Empleadez5");
            emp5.setEmail("correo5@scott.com");
            emp5.setFecha_contratacion(LocalDate.of(1995,11,11));
            emp5.setId_trabajo("AC_ACCOUNT");
            emp5.setSalario(8400);
            emp5.setId_director(702);
            emp5.setId_departamento(3);

            em.persist(emp);
            em.persist(emp2);
            em.persist(emp3);
            em.persist(emp4);
            em.persist(emp5);

            tx.commit();
*/
            em.close();
            emf.close();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getCause() + " : " + e.getMessage());
        }
    }
}
