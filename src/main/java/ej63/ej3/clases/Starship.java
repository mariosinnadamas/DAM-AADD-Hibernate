package ej63.ej3.clases;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "starships", schema = "star_wars")
public class Starship {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "starship_class", length = Integer.MAX_VALUE)
    private String starshipClass;

    @ColumnDefault("NULL")
    @Column(name = "mglt", length = 10)
    private String mglt;

    @ColumnDefault("NULL")
    @Column(name = "hyperdrive_rating", length = 10)
    private String hyperdriveRating;

    @ManyToMany(mappedBy = "starships")
    private Set<Person> people = new LinkedHashSet<>();

    public Starship() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStarshipClass() {
        return starshipClass;
    }

    public void setStarshipClass(String starshipClass) {
        this.starshipClass = starshipClass;
    }

    public String getMglt() {
        return mglt;
    }

    public void setMglt(String mglt) {
        this.mglt = mglt;
    }

    public String getHyperdriveRating() {
        return hyperdriveRating;
    }

    public void setHyperdriveRating(String hyperdriveRating) {
        this.hyperdriveRating = hyperdriveRating;
    }

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Starship{" +
                "id=" + id +
                ", starshipClass='" + starshipClass + '\'' +
                ", mglt='" + mglt + '\'' +
                ", hyperdriveRating='" + hyperdriveRating + '\'' +
                ", people=" + people +
                '}';
    }
}