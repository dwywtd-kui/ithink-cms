package com.haan.ithink.cms.repository;


import com.haan.ithink.cms.domin.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lkhan
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
