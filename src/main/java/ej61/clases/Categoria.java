package ej61.clases;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "secuencia_categoria")
    @SequenceGenerator(name = "secuencia_categoria",
    sequenceName = "secuencia_categoria", allocationSize = 1)
    private long codigo;
    @Column(name = "Nombre")
    private String nombre;
    @OneToMany(mappedBy = "categoria",
            fetch = FetchType.LAZY, //No siempre quieres las todas las piezas de una categoría
            cascade = CascadeType.ALL, // Elimina las piezas de esa categoría
            orphanRemoval = true) //Evita que tengamos hijos "huérfanos"
    private Set<Pieza> piezas = new HashSet<>();

    public Categoria() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()){
            System.err.println("ERROR: Nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public Set<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(Set<Pieza> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
