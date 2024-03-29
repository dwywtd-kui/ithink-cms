package com.ithink.cms.core.service.impl;

import com.ithink.cms.core.domin.dto.ArticleDto;
import com.ithink.cms.core.domin.entity.Article;
import com.ithink.cms.core.repository.ArticleRepository;
import com.ithink.cms.core.service.ArticleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lkhan
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository repository;

    @Override
    public ArticleDto create(ArticleDto dto) {
        Article article = map(dto);
        article.setUserId("hanliukui");
        article.setChannelId("000001");
        Article save = repository.save(article);
        dto.setId(save.getId());
        return dto;
    }

    private Article map(ArticleDto dto) {
        Article article = new Article();
        BeanUtils.copyProperties(dto,article);
        return article;
    }

    private ArticleDto map(Article article) {
        ArticleDto dto = new ArticleDto();
        BeanUtils.copyProperties(article,dto);
        return dto;
    }

    @Override
    public ArticleDto findById(Long id) {
        Article article = repository.findById(id).orElse(null);
        if (article==null){
            return null;
        }else {
            return map(article);
        }
    }
}
