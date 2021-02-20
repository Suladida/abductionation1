package com.example.codeclan.abductionationservice.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private String name;

    @Column
    private Species species;

    @Column
    private ArrayList<Abductee> population;

    public Planet(String name, Species species) {
        this.name = name;
        this.species = species;
        this.population = new ArrayList<Abductee>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public ArrayList<Abductee> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<Abductee> population) {
        this.population = population;
    }
}
