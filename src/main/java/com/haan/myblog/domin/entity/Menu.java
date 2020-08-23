package com.haan.myblog.domin.entity;

import com.haan.myblog.domin.EntityBase;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:45
 */
@Entity
@Table(name = "menu")
@Data
public class Menu extends EntityBase<Long> {
    private String name;
}
