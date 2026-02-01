package ej51;

import ej62.clases.Departamentos;
import ej62.clases.Empleados;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Ej5 {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();

            Empleados emp = cargarEmpleados(em,301);

            if (emp!=null){
                System.out.println(emp.getNombre());
            }

            em.close();
            emf.close();

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getCause() + " : " + e.getMessage());
        }
    }

    public static Empleados cargarEmpleados(EntityManager em, int idEmpleado){

        Empleados emp = em.find(Empleados.class,idEmpleado);

        if (emp==null){
            return null;
        }

        Integer idDep = emp.getIdDepartamento().getId();

        Departamentos dep = em.getReference(Departamentos.class,idDep);

        //Como podría hacer para retornar el nombre del departamento?? en este tipo de ejercicios es mejor
        // sacar toda la info en el main o en el metodo? porque dice de retornar un empleado
        System.out.println(dep.getNombreDepartamento());
        return emp;
    }
}
