package com.mustache.bbsproject2.repository;

import com.mustache.bbsproject2.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
