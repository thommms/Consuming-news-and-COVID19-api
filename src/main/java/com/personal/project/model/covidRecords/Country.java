package com.personal.project.model.covidRecords;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Country {
    @JsonSetter("Country")
    private String country;

    @JsonSetter("CountryCode")
    private String countryCode;

    @JsonSetter("Slug")
    private String slug;

    @JsonSetter("NewConfirmed")
    private Long newConfirmed;

    @JsonSetter("TotalConfirmed")
    private Long totalConfirmed;

    @JsonSetter("NewDeaths")
    private Long newDeaths;

    @JsonSetter("TotalDeaths")
    private Long totalDeaths;

    @JsonSetter("NewRecovered")
    private Long newRecovered;

    @JsonSetter("TotalRecovered")
    private Long totalRecovered;

    @JsonSetter("Date")
    private String date;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(Long newConfirmed) {
        this.newConfirmed = newConfirmed;
    }

    public Long getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(Long totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public Long getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Long newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Long getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Long totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Long getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Long newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
