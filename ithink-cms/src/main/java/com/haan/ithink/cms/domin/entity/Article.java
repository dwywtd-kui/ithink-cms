package com.haan.ithink.cms.domin.entity;

import com.haan.ithink.cms.domin.EntityBase;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hanliukui
 */
@Entity
@Data
@Table(name = "article")
public class Article extends EntityBase<Long> {

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
