package com.personal.project.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.project.model.News.News;
import com.personal.project.model.News.NewsInput;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class NewsDaoImpl implements NewsDao {
    @Override
    public ResponseEntity<News> getNews(NewsInput newsInput) {
        RestTemplate restTemplate = new RestTemplate();
        String newsUrl = "http://newsapi.org/v2/top-headlines?q="+newsInput.getNews()+"&country="+newsInput.getCountry()+"&from="+newsInput.getDate()+"&sortBy=published";
//        String newsUrl = "http://newsapi.org/v2/top-headlines?q=covid&country=ng&from=2020-03-15&sortBy=published";

        //set the headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key","83c38f97ff3d4022aa2b1e2bf7aed7ee");

        HttpEntity<String> entity = new HttpEntity<>("x-api-key",headers);

        ResponseEntity<News> responses=restTemplate.exchange(newsUrl, HttpMethod.GET, entity, News.class);
        responses.getHeaders();

        return responses;
    }
}
