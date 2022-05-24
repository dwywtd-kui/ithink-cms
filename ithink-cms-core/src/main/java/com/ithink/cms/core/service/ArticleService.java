package com.ithink.cms.core.service;


import com.ithink.cms.core.domin.dto.ArticleDto;

/**
 * @author hanliukui
 */
public interface ArticleService {
    ArticleDto create (ArticleDto dto);
    ArticleDto findById(Long id);
}
