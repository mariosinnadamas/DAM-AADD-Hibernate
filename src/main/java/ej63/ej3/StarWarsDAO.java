package ej63.ej3;

import ej63.ej3.clases.Person;

import java.util.List;

public interface StarWarsDAO {

    //OPERACIONES CRUD

    void crear_personaje(Person personaje);

    Person consultar_personaje(int id_personaje);

    void actualizar_personaje(Person personaje_actualizado);

    void eliminar_personaje(Person personaje);

    List<Person> consulta_todos();
}
