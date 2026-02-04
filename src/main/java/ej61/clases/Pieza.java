package ej61.clases;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

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
    @ManyToOne (fetch = FetchType.EAGER) //Eager porque siempre queremos saber la categoría de una pieza
    @JoinColumn(name = "codigo_categoria", nullable = false)
    private Categoria categoria;
    @OneToMany(mappedBy = "pieza")
    private Set<Suministra> suministros = new HashSet<>();

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
        if (nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()){
            throw new IllegalArgumentException("El color no puede estar vacío");
        }
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        if (precio == null){
            throw new IllegalArgumentException("El precio no puede estar vacío");
        }
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Suministra> getSuministros() {
        return suministros;
    }

    public void setSuministros(Set<Suministra> suministros) {
        this.suministros = suministros;
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
