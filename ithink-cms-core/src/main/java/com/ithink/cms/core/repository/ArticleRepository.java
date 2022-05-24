package com.ithink.cms.core.repository;


import com.ithink.cms.core.domin.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lkhan
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
