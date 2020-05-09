package com.lagou.service;

import com.lagou.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {

    public List<Article> queryAll();

    public Article queryById(Integer id);
}
