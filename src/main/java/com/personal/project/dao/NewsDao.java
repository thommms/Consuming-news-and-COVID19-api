package com.personal.project.dao;

import com.personal.project.model.News.News;
import com.personal.project.model.News.NewsInput;
import org.springframework.http.ResponseEntity;

public interface NewsDao {
    public ResponseEntity<News> getNews(NewsInput newsInput);
}
