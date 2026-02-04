package ej63.ej1.clases;

import jakarta.persistence.*;

@Entity
@Table(name = "localizaciones_departamentos")
public class Local_depar {

    @Id
    @GeneratedValue
    private int id;

    //Muchos registros pueden apuntar a la misma localizacion
    @ManyToOne
    @JoinColumn(name = "id_localizacion")
    private Localizaciones localizacion;

    //Muchos registros pueden apuntar al mismo departamento
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamentos departamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localizaciones getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizaciones localizacion) {
        this.localizacion = localizacion;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
}
