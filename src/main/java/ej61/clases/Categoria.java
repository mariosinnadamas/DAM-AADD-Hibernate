package ej61.clases;

import jakarta.persistence.*;

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

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
