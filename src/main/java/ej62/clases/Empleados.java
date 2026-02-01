package ej62.clases;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "empleados", schema = "empleados")
public class Empleados {
    @Id
    @Column(name = "id_empleado", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 20)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 20)
    private String apellido;

    @Column(name = "email", nullable = false, length = 25)
    private String email;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "fecha_contratacion", nullable = false)
    private LocalDate fechaContratacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_trabajo", nullable = false)
    private Trabajo idTrabajo;

    @Column(name = "salario", precision = 8, scale = 2)
    private BigDecimal salario;

    @Column(name = "comision", precision = 4, scale = 2)
    private BigDecimal comision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_director")
    private Empleados idDirector;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento")
    private Departamentos idDepartamento;

    @OneToMany(mappedBy = "idDirector")
    private Set<Departamentos> departamentos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idDirector")
    private Set<Empleados> empleados = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idEmpleado")
    private Set<HistorialTrab> historialTrabs = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Trabajo getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Trabajo idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public Empleados getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Empleados idDirector) {
        this.idDirector = idDirector;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Set<Departamentos> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamentos> departamentos) {
        this.departamentos = departamentos;
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