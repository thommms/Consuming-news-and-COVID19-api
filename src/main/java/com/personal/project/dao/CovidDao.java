package com.personal.project.dao;

import com.personal.project.model.covidRecords.ByCountry;
import com.personal.project.model.covidRecords.Country;
import com.personal.project.model.covidRecords.CovidInput;
import com.personal.project.model.covidRecords.General;
import org.springframework.http.ResponseEntity;

public interface CovidDao {
    public ResponseEntity<General> getSummary();
    public ResponseEntity<ByCountry> getByCountry();
    public Country getCasesByCountry(CovidInput covidInput);
}
