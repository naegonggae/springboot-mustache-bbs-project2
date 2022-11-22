package com.mustache.bbsproject2.controller;

import com.mustache.bbsproject2.domain.dto.controller.ArticleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j // 로거 추가
public class ArticleController {

    @GetMapping("/new")
    public String createPage() {
        return "articles/new";
    }

    @PostMapping("") // /articles
    public String articles(ArticleDto articleDto) {
        log.info(articleDto.getTitle());
        return "";
    }
}