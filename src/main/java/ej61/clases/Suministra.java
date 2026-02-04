package ej61.clases;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Suministra {
    @Id
    @GeneratedValue
    private long id;
    //Para que cuando cargue un objeto Suministra cargue automáticament el objeto al que apunta la FK de Proveedor
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_proveedor", nullable = false)
    private Proveedor proveedor;
    //Para que cuando cargue un objeto Suministra cargue automáticament el objeto al que apunta la FK de Pieza
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "codigo_pieza", nullable = false)
    private Pieza pieza;
    private int cantidad;
    private LocalDate fecha;

    public Suministra() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Suministra{" +
                "id=" + id +
                ", proveedor=" + proveedor +
                ", pieza=" + pieza +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                '}';
    }
}
