package com.mustache.bbsproject2.controller;

import com.mustache.bbsproject2.domain.dto.controller.ArticleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/article")
@Slf4j
public class ArticleController {
    @GetMapping(value = "/new")
    public String createArticleForm(ArticleDto form) {

        return "new";
    }
    @PostMapping (value = "/new/{id}")
    public String createArticle(@PathVariable String id, ArticleDto articleDto) {
        log.
        return "new";
    }
}
