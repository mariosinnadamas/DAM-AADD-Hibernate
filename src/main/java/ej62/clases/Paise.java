package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "paises")
public class Paise {
    @Id
    @Column(name = "id_pais", nullable = false, length = 2)
    private String idPais;

    @Column(name = "nombre_pais", length = 40)
    private String nombrePais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_region")
    private Regione idRegion;

    @OneToMany
    @JoinColumn(name = "id_pais")
    private Set<Localizacione> localizaciones = new LinkedHashSet<>();

    public Paise() {
    }

    public Paise(String idPais, String nombrePais, Regione idRegion) {
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

    public Regione getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Regione idRegion) {
        this.idRegion = idRegion;
    }

    public Set<Localizacione> getLocalizaciones() {
        return localizaciones;
    }

    public void setLocalizaciones(Set<Localizacione> localizaciones) {
        this.localizaciones = localizaciones;
    }

}