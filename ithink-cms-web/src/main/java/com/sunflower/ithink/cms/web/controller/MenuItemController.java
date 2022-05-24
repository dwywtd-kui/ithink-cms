package com.sunflower.ithink.cms.web.controller;


import com.ithink.cms.core.domin.dto.MenuItemDto;
import com.ithink.cms.core.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lkhan
 */
@RestController
@RequestMapping("/menuitem")
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/menu/{menuId}/tree")
    public List<MenuItemDto> getTree(@PathVariable(name = "menuId") Long menuId){
        return menuItemService.findByStoreIdWithTree(menuId);
    }

    @PostMapping("/addsibling")
     public MenuItemDto addSibling(@RequestParam(required = false) Long id,@RequestBody MenuItemDto dto){
        return menuItemService.addSibling(dto,id);
    }

    @PostMapping("/addchild")
    public MenuItemDto addChild(@RequestParam Long id,@RequestBody MenuItemDto dto){
        return menuItemService.addChild(dto,id);
    }

}
