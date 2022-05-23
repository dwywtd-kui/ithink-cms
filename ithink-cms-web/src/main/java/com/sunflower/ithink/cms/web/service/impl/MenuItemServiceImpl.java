package com.sunflower.ithink.cms.web.service.impl;

import com.sunflower.ithink.cms.web.domin.dto.MenuItemDto;
import com.sunflower.ithink.cms.web.domin.entity.MenuItem;
import com.sunflower.ithink.cms.web.repository.MenuItemRepository;
import com.sunflower.ithink.cms.web.service.MenuItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:52
 */
@Service
public class MenuItemServiceImpl extends TreeAppService<MenuItemRepository, MenuItem, MenuItemDto,Long> implements MenuItemService {

    public MenuItemServiceImpl(MenuItemRepository repository) {
        super(repository);
    }

    @Override
    protected List<MenuItem> getEntityList(Map<String, Object> params) {
        return null;
    }

    @Override
    protected Class<MenuItem> getEntityType() {
        return MenuItem.class;
    }

    @Override
    protected Class<MenuItemDto> getDtoType() {
        return MenuItemDto.class;
    }

    @Override
    protected MenuItem referOtherAttributes(MenuItem entity, MenuItem other) {
        return entity;
    }
}
