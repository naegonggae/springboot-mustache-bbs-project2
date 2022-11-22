package com.mustache.bbsproject2.domain.dto;

import com.mustache.bbsproject2.domain.entity.Article;
import lombok.Getter;

@Getter
public class ArticleDto {
    private String title;

    public ArticleDto(String title) {
        this.title = title;
    }
    public Article toEntity() {
        return new Article(this.title);
    }
}

