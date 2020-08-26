package com.haan.myblog.domin.dto;

import com.haan.myblog.domin.TreeEntityDto;
import com.haan.myblog.domin.entity.MenuItem;
import lombok.Data;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:50
 */
@Data
public class MenuItemDto extends TreeEntityDto<MenuItemDto,Long> {

    private String name;

    private Boolean open = true;
}
