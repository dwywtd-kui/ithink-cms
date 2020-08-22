package com.haan.myblog.domin.entity;

import com.haan.myblog.domin.EntityBase;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class Article extends EntityBase {

    /**标题*/
    private String title;

    /**正文-Markdown*/
    @Column(columnDefinition = "text")
    private String markdown;

    /**正文-HTML*/
    @Column(columnDefinition = "text")
    private String html;

    /**作者*/
    private String userId;

    /**所属栏目*/
    private String channelId;

}
