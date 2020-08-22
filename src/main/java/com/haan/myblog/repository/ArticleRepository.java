package com.haan.myblog.repository;

import com.haan.myblog.domin.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lkhan
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
