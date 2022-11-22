package com.mustache.bbsproject2.domain.dto.controller;

import lombok.Getter;

@Getter
public class ArticleDto {
    private Long id;
    private String name;
    private String password;

    public ArticleDto(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
