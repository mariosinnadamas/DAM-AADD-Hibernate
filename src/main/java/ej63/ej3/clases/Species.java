package ej63.ej3.clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "species", schema = "star_wars")
public class Species {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ColumnDefault("NULL")
    @Column(name = "name", length = 60)
    private String name;

    @ColumnDefault("NULL")
    @Column(name = "average_height", length = 10)
    private String averageHeight;

    @ColumnDefault("NULL")
    @Column(name = "average_lifespan", length = 20)
    private String averageLifespan;

    @ColumnDefault("NULL")
    @Column(name = "classification", length = 50)
    private String classification;

    @ColumnDefault("NULL")
    @Column(name = "designation", length = 60)
    private String designation;

    @Column(name = "eye_colors", length = Integer.MAX_VALUE)
    private String eyeColors;

    @Column(name = "hair_colors", length = Integer.MAX_VALUE)
    private String hairColors;

    @ColumnDefault("0")
    @Column(name = "homeworld", nullable = false)
    private Integer homeworld;

    @ColumnDefault("NULL")
    @Column(name = "language", length = 20)
    private String language;

    @Column(name = "skin_colors", length = Integer.MAX_VALUE)
    private String skinColors;

    @Column(name = "created")
    private Instant created;

    @Column(name = "edited")
    private Instant edited;

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

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    public Integer getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Integer homeworld) {
        this.homeworld = homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
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

}