package ej61.clases;

import jakarta.persistence.*;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "mi_secuencia")
    @SequenceGenerator(name = "mi_secuencia",
    sequenceName = "secuencia_id", allocationSize = 1)
    private long codigo;
    @Column(name="Nombre", nullable = false)
    private String nombre;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Provincia")
    private String provincia;
    @Column(name = "Ciudad")
    private String ciudad;

    public Proveedor() {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
