package com.haan.myblog.domin.dto;

import com.haan.myblog.domin.DtoBase;
import lombok.Data;

@Data
public class ArticleDto extends DtoBase {
    private String title;
    private String markdown;
    private String html;
}
