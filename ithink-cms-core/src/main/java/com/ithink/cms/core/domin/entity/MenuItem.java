package com.ithink.cms.core.domin.entity;

import com.ithink.cms.core.domin.TreeEntityBase;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:42
 */
@Entity
@Table(name = "menuitem")
@Data
public class MenuItem extends TreeEntityBase<MenuItem,Long> {

    private String name;
}
