package com.sunflower.ithink.cms.web.domin.dto;


import com.sunflower.ithink.cms.web.domin.TreeEntityDto;
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
