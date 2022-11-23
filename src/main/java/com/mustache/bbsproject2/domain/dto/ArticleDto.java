package com.mustache.bbsproject2.domain.dto;

import com.mustache.bbsproject2.domain.entity.Article;
import lombok.Getter;

@Getter
public class ArticleDto {
    private String title;
    private String content;

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return new Article(this.title, this.content);
    }
}

