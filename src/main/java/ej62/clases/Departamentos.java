package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "departamentos", schema = "empleados")
public class Departamentos {
    @Id
    @Column(name = "id_departamento", nullable = false)
    private Integer id;

    @Column(name = "nombre_departamento", nullable = false, length = 30)
    private String nombreDepartamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_director")
    private Empleados idDirector;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_localizacion")
    private Localizaciones idLocalizacion;

    @OneToMany
    private Set<Empleados> empleados = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idDepartamento")
    private Set<HistorialTrab> historialTrabs = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Empleados getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Empleados idDirector) {
        this.idDirector = idDirector;
    }

    public Localizaciones getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Localizaciones idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public Set<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Set<Empleados> empleados) {
        this.empleados = empleados;
    }

    public Set<HistorialTrab> getHistorialTrabs() {
        return historialTrabs;
    }

    public void setHistorialTrabs(Set<HistorialTrab> historialTrabs) {
        this.historialTrabs = historialTrabs;
    }

}