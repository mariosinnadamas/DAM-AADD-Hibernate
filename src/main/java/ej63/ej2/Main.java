package ej63.ej2;

import ej61.clases.Categoria;
import ej61.clases.Pieza;
import ej61.clases.Proveedor;
import ej61.clases.Suministra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

/*
    Completa lo que hiciste en el ejercicio 6.1.2 ahora que sabes representar to do tipo de relaciones.
    Incluye las opciones vistas en el apartado 6.6.10.

    Enunciado ejercicio 6.1.2:
    Introduce todas las comprobaciones necesarias en los métodos setter de los POJOs.
    Introduce al menos tres categorías, cuatro proveedores y 7 piezas.
    Prueba a introducir un dato incorrecto en cada una de las clases y gestiónalo
    en el main (o métodos auxiliares).
 */
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejs63");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        //Duda, se puede dar un caso en el que tengamos una doble dependencia y no podamos crear un objeto sin otro que a su vez aun no está creado?

        //Primero: creo categorías
        Categoria c1 = new Categoria();
        c1.setNombre("Mecánica");

        Categoria c2 = new Categoria();
        c2.setNombre("Tornillería");

        em.persist(c1);
        em.persist(c2);

        //Segundo: proveedores
        Proveedor p1 = new Proveedor();
        p1.setNombre("Paco");
        p1.setProvincia("Madrid");
        p1.setCiudad("Madrid");
        p1.setTelefono("123456789");

        Proveedor p2 = new Proveedor();
        p2.setNombre("Juan");
        p2.setProvincia("Valladolid");
        p2.setCiudad("Medina del campo");
        p2.setTelefono("987654321");

        em.persist(p1);
        em.persist(p2);

        //Tercero: piezas y asignamos categorías
        Pieza pi1 = new Pieza();
        pi1.setNombre("Bujía");
        pi1.setPrecio(50.0);
        pi1.setColor("Plateada");
        pi1.setCategoria(c1);

        Pieza pi2 = new Pieza();
        pi2.setNombre("Tornillo");
        pi2.setPrecio(50.0);
        pi2.setColor("Plateado");
        pi2.setCategoria(c2);

        em.persist(pi1);
        em.persist(pi2);

        //Cuarto: relaciones
        Suministra s1 = new Suministra();
        s1.setProveedor(p1);
        s1.setPieza(pi1);
        s1.setCantidad(100);
        s1.setFecha(LocalDate.now());

        Suministra s2 = new Suministra();
        s2.setProveedor(p2);
        s2.setPieza(pi2);
        s2.setCantidad(1000);
        s2.setFecha(LocalDate.now());

        Suministra s3 = new Suministra();
        s3.setProveedor(p2);
        s3.setPieza(pi1);
        s3.setCantidad(2000);
        s3.setFecha(LocalDate.now());

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        tx.commit();

        em.close();
        emf.close();
    }
}
