package ej63.ej1.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Departamentos {
    @Id
    @GeneratedValue
    private int id_departamento;

    private String nombre_departamento;
    private int id_director;

    @OneToMany(mappedBy = "departamento")
    private Set<Local_depar> relaciones = new HashSet<>();

    public Departamentos() {
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }

    public Set<Local_depar> getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(Set<Local_depar> relaciones) {
        this.relaciones = relaciones;
    }
}
