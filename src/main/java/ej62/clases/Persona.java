package ej62.clases;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "direccion_completa")
    @Convert(converter = Conversor.class)
    private Casa direccion;

    public Persona() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Casa getDireccion() {
        return direccion;
    }

    public void setDireccion(Casa direccion) {
        this.direccion = direccion;
    }
}
