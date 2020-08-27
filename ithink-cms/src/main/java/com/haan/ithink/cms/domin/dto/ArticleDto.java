package com.haan.ithink.cms.domin.dto;

import com.haan.ithink.cms.domin.DtoBase;
import lombok.Data;

@Data
public class ArticleDto extends DtoBase {
    private String title;
    private String markdown;
    private String html;
}
