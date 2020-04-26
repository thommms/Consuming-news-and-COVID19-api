package com.personal.project.controller;

import com.personal.project.dao.CovidDao;
import com.personal.project.model.covidRecords.ByCountry;
import com.personal.project.model.covidRecords.Country;
import com.personal.project.model.covidRecords.CovidInput;
import com.personal.project.model.covidRecords.General;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class CovidController {

    @Autowired
    private CovidDao covidDao;

    @GetMapping(path="/summary")
    public ResponseEntity<General> Summary() {
        return  covidDao.getSummary();
    }

    @GetMapping(path="/summary/country")
    public Country getCountrySummary(@RequestBody final CovidInput covidInput) {
        return covidDao.getCasesByCountry(covidInput);
    }

    @GetMapping(path = "/country/nigeria")
    public ResponseEntity<ByCountry> getByCountry() {
        return covidDao.getByCountry();
    }
}
