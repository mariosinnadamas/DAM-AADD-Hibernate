package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "paises", schema = "empleados")
public class Paises {
    @Id
    @Column(name = "id_pais", nullable = false, length = 2)
    private String idPais;

    @Column(name = "nombre_pais", length = 40)
    private String nombrePais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_region")
    private Regiones idRegion;

    public Paises() {
    }

    public Paises(String idPais, String nombrePais, Regiones idRegion) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
        this.idRegion = idRegion;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Regiones getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Regiones idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public String toString() {
        return "Paise{" +
                "idPais='" + idPais + '\'' +
                ", nombrePais='" + nombrePais + '\'' +
                ", idRegion=" + idRegion +
                '}';
    }
}