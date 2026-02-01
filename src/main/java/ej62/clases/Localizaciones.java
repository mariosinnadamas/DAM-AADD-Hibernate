package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "localizaciones", schema = "empleados")
public class Localizaciones {
    @Id
    @Column(name = "id_localizacion", nullable = false)
    private Integer id;

    @Column(name = "direccion", length = 40)
    private String direccion;

    @Column(name = "codigo_postal", length = 12)
    private String codigoPostal;

    @Column(name = "ciudad", nullable = false, length = 30)
    private String ciudad;

    @Column(name = "provincia", length = 25)
    private String provincia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pais")
    private Paises idPais;

    public Localizaciones() {
    }

    public Localizaciones(Paises idPais, String provincia, String ciudad, String codigoPostal, String direccion, Integer id) {
        this.idPais = idPais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Paises getIdPais() {
        return idPais;
    }

    public void setIdPais(Paises idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "Localizaciones{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", idPais=" + idPais +
                '}';
    }
}