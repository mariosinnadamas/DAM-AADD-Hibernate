package ej62.clases;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "trabajos", schema = "empleados")
public class Trabajo {
    @Id
    @Column(name = "id_trabajo", nullable = false, length = 10)
    private String idTrabajo;

    @Column(name = "nombre_trabajo", nullable = false, length = 35)
    private String nombreTrabajo;

    @Column(name = "min_salario")
    private Integer minSalario;

    @Column(name = "max_salario")
    private Integer maxSalario;

    @OneToMany(mappedBy = "idTrabajo")
    private Set<Empleados> empleados = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idTrabajo")
    private Set<HistorialTrab> historialTrabs = new LinkedHashSet<>();

    public String getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(String idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public Integer getMinSalario() {
        return minSalario;
    }

    public void setMinSalario(Integer minSalario) {
        this.minSalario = minSalario;
    }

    public Integer getMaxSalario() {
        return maxSalario;
    }

    public void setMaxSalario(Integer maxSalario) {
        this.maxSalario = maxSalario;
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