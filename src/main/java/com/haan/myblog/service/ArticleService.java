package com.haan.myblog.service;

import com.haan.myblog.domin.dto.ArticleDto;
import org.springframework.stereotype.Service;

public interface ArticleService {
    ArticleDto create (ArticleDto dto);
    ArticleDto findById(Long id);
}
