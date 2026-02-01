package ej62.clases;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "historial_trab", schema = "empleados")
public class HistorialTrab {
    @EmbeddedId
    private HistorialTrabId id;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento")
    private Departamentos idDepartamento;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleados idEmpleado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_trabajo", nullable = false)
    private Trabajo idTrabajo;

    public Trabajo getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Trabajo idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Empleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public HistorialTrabId getId() {
        return id;
    }

    public void setId(HistorialTrabId id) {
        this.id = id;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

}