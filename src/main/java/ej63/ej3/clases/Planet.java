package ej63.ej3.clases;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "planets", schema = "star_wars")
public class Planet {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ColumnDefault("NULL")
    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "climate", length = Integer.MAX_VALUE)
    private String climate;

    @ColumnDefault("0")
    @Column(name = "rotation_period")
    private Integer rotationPeriod;

    @ColumnDefault("0")
    @Column(name = "orbital_period")
    private Integer orbitalPeriod;

    @ColumnDefault("0")
    @Column(name = "diameter")
    private Integer diameter;

    @Column(name = "gravity", length = Integer.MAX_VALUE)
    private String gravity;

    @Column(name = "terrain", length = Integer.MAX_VALUE)
    private String terrain;

    @ColumnDefault("NULL")
    @Column(name = "surface_water", length = 10)
    private String surfaceWater;

    @Column(name = "population")
    private Long population;

    @Column(name = "created")
    private Instant created;

    @Column(name = "edited")
    private Instant edited;

    @OneToMany(mappedBy = "homeworld")
    private Set<Person> people = new LinkedHashSet<>();

    public Planet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public Integer getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(Integer rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public Integer getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(Integer orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getEdited() {
        return edited;
    }

    public void setEdited(Instant edited) {
        this.edited = edited;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", climate='" + climate + '\'' +
                ", rotationPeriod=" + rotationPeriod +
                ", orbitalPeriod=" + orbitalPeriod +
                ", diameter=" + diameter +
                ", gravity='" + gravity + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surfaceWater='" + surfaceWater + '\'' +
                ", population=" + population +
                ", created=" + created +
                ", edited=" + edited +
                ", people=" + people +
                '}';
    }
}