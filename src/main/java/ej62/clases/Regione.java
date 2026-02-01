package ej62.clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "regiones")
public class Regione {

    @Id
    @Column(name = "id_region", nullable = false)
    private Integer id;

    @Column(name = "nombre_region", length = 25)
    private String nombreRegion;

    public Regione() {

    }
    public Regione(Integer id, String nombreRegion) {
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
        return "Regiones: " +
                "id = " + id +
                ", nombreRegion = " + nombreRegion;
    }
}