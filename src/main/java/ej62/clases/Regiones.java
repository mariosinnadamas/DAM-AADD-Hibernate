package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "regiones", schema = "empleados")
public class Regiones {
    @Id
    @Column(name = "id_region", nullable = false)
    private Integer id;

    @Column(name = "nombre_region", length = 25)
    private String nombreRegion;

    public Regiones() {
    }

    public Regiones(Integer id, String nombreRegion) {
        this.id = id;
        this.nombreRegion = nombreRegion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    @Override
    public String toString() {
        return "Regione{" +
                "id=" + id +
                ", nombreRegion='" + nombreRegion +
                '}';
    }
}