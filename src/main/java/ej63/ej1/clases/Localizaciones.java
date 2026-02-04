package ej63.ej1.clases;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Localizaciones {
    @Id
    @GeneratedValue
    private int id_localizacion;

    private String direccion;
    private String codigo_postal;
    private String ciudad;
    private String provincia;

    //Relacion 1:N con la tabla intermedia
    @OneToMany(mappedBy = "localizacion")
    private Set<Local_depar> relaciones = new HashSet<>();

    //Se crean constructores vacíos para que Hibernate no rompa el modelo cuando por ejemplo genera el ID
    //Además así no mezclamos persistencia con lógica de negocio
    public Localizaciones() {
    }

    public int getId_localizacion() {
        return id_localizacion;
    }

    public void setId_localizacion(int id_localizacion) {
        this.id_localizacion = id_localizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
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

    public Set<Local_depar> getRelaciones() {
        return relaciones;
    }

    public void setRelaciones(Set<Local_depar> relaciones) {
        this.relaciones = relaciones;
    }
}
