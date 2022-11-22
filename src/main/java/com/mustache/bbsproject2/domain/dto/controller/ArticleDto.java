package com.mustache.bbsproject2.domain.dto.controller;

import lombok.Getter;

@Getter
public class ArticleDto {
    private String title;

    public ArticleDto(String title) {
        this.title = title;
    }
}

