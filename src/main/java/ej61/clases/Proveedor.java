package ej61.clases;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
    @OneToMany(mappedBy = "proveedor")
    private Set<Suministra> suministros = new HashSet<>();

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
        if (nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.isEmpty()){
            throw new IllegalArgumentException("El telefono no puede ser nulo");
        }
        if (telefono.length()>9){
            throw new IllegalArgumentException("El telefono no puede tener más de 9 digitos");
        }
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        if (provincia.isEmpty()){
            throw new IllegalArgumentException("La provincia no puede estar vacía");
        }
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad.isEmpty()){
            throw new IllegalArgumentException("La ciudad no puede estar vacía");
        }
        this.ciudad = ciudad;
    }

    public Set<Suministra> getSuministros() {
        return suministros;
    }

    public void setSuministros(Set<Suministra> suministros) {
        this.suministros = suministros;
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
