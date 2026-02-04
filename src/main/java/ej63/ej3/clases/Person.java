package ej63.ej3.clases;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "people", schema = "star_wars")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ColumnDefault("NULL")
    @Column(name = "name", length = 80)
    private String name;

    @ColumnDefault("NULL")
    @Column(name = "gender", length = 15)
    private String gender;

    @ColumnDefault("NULL")
    @Column(name = "birth_year", length = 10)
    private String birthYear;

    @ColumnDefault("0")
    @Column(name = "height", nullable = false)
    private Short height;

    @Column(name = "mass", nullable = false)
    private Float mass;

    @ColumnDefault("NULL")
    @Column(name = "hair_color", length = 20)
    private String hairColor;

    @ColumnDefault("NULL")
    @Column(name = "skin_color", length = 30)
    private String skinColor;

    @ColumnDefault("NULL")
    @Column(name = "eye_color", length = 20)
    private String eyeColor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @ColumnDefault("0")
    @JoinColumn(name = "homeworld_id", nullable = false)
    private Planet homeworld;

    @Column(name = "created")
    private Instant created;

    @Column(name = "edited")
    private Instant edited;

    @ManyToMany
    @JoinTable(name = "starships_pilots",
            inverseJoinColumns = @JoinColumn(name = "starship_id"))
    private Set<Starship> starships = new LinkedHashSet<>();

    public Person() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Planet getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Planet homeworld) {
        this.homeworld = homeworld;
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

    public Set<Starship> getStarships() {
        return starships;
    }

    public void setStarships(Set<Starship> starships) {
        this.starships = starships;
    }

    @Override
    public String toString() { //Importante que el toString no incluya la coleccion de naves, ya que es algo que solo se utiliza para la relación con la tabla vehicles_pilots
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", homeworld_id=" + (homeworld != null ? homeworld.getId() : "null") + //Importante incluir que no imprima el objeto entero, si no solo el ID como la tabla indica
                ", created=" + created +
                ", edited=" + edited +
                '}';
    }
    //Con este toString para el ejercicio 7.1 salen todos los datos de los objetos relacionados
    public String toString_conTodo() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", homeworld=" + homeworld +
                ", created=" + created +
                ", edited=" + edited +
                ", starships=" + starships +
                '}';
    }
}