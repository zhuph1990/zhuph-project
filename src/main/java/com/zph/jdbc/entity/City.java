package com.zph.jdbc.entity;

public class City {
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private String Population;

    public City() {
    }


    public City(int id, String name, String countryCode, String district, String population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        Population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", Population='" + Population + '\'' +
                '}';
    }
}
