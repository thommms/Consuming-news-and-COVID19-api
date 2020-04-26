package com.personal.project.controller;


import com.personal.project.dao.NewsDao;
import com.personal.project.model.News.News;
import com.personal.project.model.News.NewsInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class NewsController {
    @Autowired
    private NewsDao newsDao;

    @GetMapping(path = "/getNews")
    public ResponseEntity<News> getNews(@RequestBody final NewsInput newsInput) {
        return newsDao.getNews(newsInput);
    }
}
