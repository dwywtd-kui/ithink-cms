package com.haan.myblog.service.impl;

import com.haan.myblog.domin.dto.MenuDto;
import com.haan.myblog.domin.entity.Menu;
import com.haan.myblog.repository.MenuRepository;
import com.haan.myblog.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:56
 */
@Service
public class MenuServiceImpl extends CrudAppServiceBase<MenuRepository, Menu, MenuDto,Long>  implements MenuService {
    public MenuServiceImpl(MenuRepository repository) {
        super(repository);
    }

    @Override
    protected Class<Menu> getEntityType() {
        return Menu.class;
    }

    @Override
    protected Class<MenuDto> getDtoType() {
        return MenuDto.class;
    }
}
