package com.lagou.springboot_blog;

import com.lagou.pojo.Article;
import com.lagou.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootBlogApplicationTests {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void contextLoads() {
        List<Article> all = articleRepository.findAll();
        for (Article article : all) {
            System.out.println(article);
        }
        System.out.println(articleRepository.findAll());
    }

}
