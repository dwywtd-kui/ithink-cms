package com.ithink.cms.core.domin.dto;

import com.ithink.cms.core.domin.DtoBase;
import lombok.Data;

@Data
public class ArticleDto extends DtoBase {
    private String title;
    private String markdown;
    private String html;
}
