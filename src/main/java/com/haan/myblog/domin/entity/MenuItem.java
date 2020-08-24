package com.haan.myblog.domin.entity;

import com.haan.myblog.domin.TreeEntityBase;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
