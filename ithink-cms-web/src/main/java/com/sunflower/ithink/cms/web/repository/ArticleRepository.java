package com.sunflower.ithink.cms.web.repository;


import com.sunflower.ithink.cms.web.domin.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lkhan
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
