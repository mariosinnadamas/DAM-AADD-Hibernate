package ej62.clases;

import jakarta.persistence.*;

@Entity
@Table(name = "localizaciones")
public class Localizacione {
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
    private Paise idPais;

    public Localizacione() {
    }

    public Localizacione(Integer id, String direccion, String codigoPostal, String ciudad, String provincia, Paise idPais) {
        this.id = id;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.idPais = idPais;
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

    public Paise getIdPais() {
        return idPais;
    }

    public void setIdPais(Paise idPais) {
        this.idPais = idPais;
    }

}