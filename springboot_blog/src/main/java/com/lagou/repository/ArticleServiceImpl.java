package com.lagou.repository;

import com.lagou.pojo.Article;
import com.lagou.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> queryAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article queryById(Integer id) {
        Optional<Article> optional = articleRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
