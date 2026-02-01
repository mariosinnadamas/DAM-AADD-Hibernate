package ej61.clases;

import jakarta.persistence.*;

@Entity
@Table(name = "PIEZAS")
public class Pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "secuencia_pieza")
    @SequenceGenerator(name = "secuencia_pieza",
    sequenceName = "secuencia_pieza", allocationSize = 1)
    private long codigo;
    @Column(name = "Nombre", nullable = false)
    private String nombre;
    @Column(name = "Color")
    private String color;
    @Column(name = "Ciudad")
    private Double precio;

    public Pieza() {
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
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
