package com.haan.ithink.cms.service.impl;

import com.haan.ithink.cms.domin.dto.MenuDto;
import com.haan.ithink.cms.domin.entity.Menu;
import com.haan.ithink.cms.repository.MenuRepository;
import com.haan.ithink.cms.service.MenuService;
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
