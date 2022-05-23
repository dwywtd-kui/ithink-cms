package com.sunflower.ithink.cms.web.service;


import com.sunflower.ithink.cms.web.domin.dto.ArticleDto;

/**
 * @author hanliukui
 */
public interface ArticleService {
    ArticleDto create (ArticleDto dto);
    ArticleDto findById(Long id);
}
