package com.personal.project.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.project.model.covidRecords.ByCountry;
import com.personal.project.model.covidRecords.Country;
import com.personal.project.model.covidRecords.CovidInput;
import com.personal.project.model.covidRecords.General;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CovidDaoImpl implements CovidDao {

    ObjectMapper mapper = new ObjectMapper();
    private Object object;

    @Override
    public ResponseEntity<General> getSummary() {
        RestTemplate restTemplate = new RestTemplate();
        String summaryUrl = "https://api.covid19api.com/summary";
        ResponseEntity<General> responseSummary = restTemplate.getForEntity(summaryUrl, General.class);
        responseSummary.getHeaders();
        return responseSummary;
    }

    @Override
    public Country getCasesByCountry(CovidInput covidInput) {
        RestTemplate restTemplate = new RestTemplate();
        String summaryUrl = "https://api.covid19api.com/summary";
        ResponseEntity<General> responseSummary = restTemplate.getForEntity(summaryUrl, General.class);
        responseSummary.getHeaders();

        Country[] countryArray = responseSummary.getBody().getCountries();

        Country getCountrySummary = null;
        for (int i = 0; i < countryArray.length; i++) {
            if (countryArray[i].getSlug().equals(covidInput.getCountry().toLowerCase())) {
                getCountrySummary = countryArray[i];
            }
        }
        return getCountrySummary;
    }

    @Override
    public ResponseEntity<ByCountry> getByCountry() {
        RestTemplate restTemplate = new RestTemplate();
        String countryUrl = "https://api.covid19api.com/country/nigeria?from=2020-03-01T00:00:00Z&to=2020-05-01T00:00:00Z";
        ResponseEntity<ByCountry> responseByCountry = restTemplate.getForEntity(countryUrl, ByCountry.class);
        responseByCountry.getHeaders();

        System.out.println("============================>here " + responseByCountry.getHeaders());
        return responseByCountry;

    }
}
