package com.haan.ithink.cms.service;


import com.haan.ithink.cms.domin.dto.ArticleDto;

/**
 * @author hanliukui
 */
public interface ArticleService {
    ArticleDto create (ArticleDto dto);
    ArticleDto findById(Long id);
}
