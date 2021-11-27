package com.adoptapp.solicitud_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Pet {


    enum Sizes {
        LG,
        MD,
        SM
    }

    enum Status {
        RG,
        RQ,
        AP,
        RT
    }

    @Id
    private String id;
    private String name;
    private String species;
    private Sizes size;
    private Integer age;
    private String country;
    private String city;
    private boolean cohabitation_animals;
    private boolean cohabitation_kids;
    private boolean pathologies;
    private String diseases_drugs;
    private boolean sterilized;
    private boolean vaccinated;
    private String vaccines;
    private boolean deworming;
    private String dewormer;
    private String history;
    private Status status;
    private String image;
    private Date created_at;
    private String updated_at;

    public Pet(String id, String name, String species, Sizes size, Integer age, String country, String city, boolean cohabitation_animals, boolean cohabitation_kids, boolean pathologies, String diseases_drugs, boolean sterilized, boolean vaccinated, String vaccines, boolean deworming, String dewormer, String history, Status status, String image, Date created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.size = size;
        this.age = age;
        this.country = country;
        this.city = city;
        this.cohabitation_animals = cohabitation_animals;
        this.cohabitation_kids = cohabitation_kids;
        this.pathologies = pathologies;
        this.diseases_drugs = diseases_drugs;
        this.sterilized = sterilized;
        this.vaccinated = vaccinated;
        this.vaccines = vaccines;
        this.deworming = deworming;
        this.dewormer = dewormer;
        this.history = history;
        this.status = status;
        this.image = image;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCohabitation_animals() {
        return cohabitation_animals;
    }

    public void setCohabitation_animals(boolean cohabitation_animals) {
        this.cohabitation_animals = cohabitation_animals;
    }

    public boolean isCohabitation_kids() {
        return cohabitation_kids;
    }

    public void setCohabitation_kids(boolean cohabitation_kids) {
        this.cohabitation_kids = cohabitation_kids;
    }

    public boolean isPathologies() {
        return pathologies;
    }

    public void setPathologies(boolean pathologies) {
        this.pathologies = pathologies;
    }

    public String getDiseases_drugs() {
        return diseases_drugs;
    }

    public void setDiseases_drugs(String diseases_drugs) {
        this.diseases_drugs = diseases_drugs;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getVaccines() {
        return vaccines;
    }

    public void setVaccines(String vaccines) {
        this.vaccines = vaccines;
    }

    public boolean isDeworming() {
        return deworming;
    }

    public void setDeworming(boolean deworming) {
        this.deworming = deworming;
    }

    public String getDewormer() {
        return dewormer;
    }

    public void setDewormer(String dewormer) {
        this.dewormer = dewormer;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
