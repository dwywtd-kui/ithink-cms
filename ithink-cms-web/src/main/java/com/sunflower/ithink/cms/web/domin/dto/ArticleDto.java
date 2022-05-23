package com.sunflower.ithink.cms.web.domin.dto;

import com.sunflower.ithink.cms.web.domin.DtoBase;
import lombok.Data;

@Data
public class ArticleDto extends DtoBase {
    private String title;
    private String markdown;
    private String html;
}
