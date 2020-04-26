package com.personal.project.model.covidRecords;


import com.fasterxml.jackson.annotation.JsonSetter;

public class Global {
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
}
