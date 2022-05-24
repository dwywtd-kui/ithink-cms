package com.ithink.cms.core.service.impl;

import com.ithink.cms.core.domin.dto.MenuDto;
import com.ithink.cms.core.domin.entity.Menu;
import com.ithink.cms.core.repository.MenuRepository;
import com.ithink.cms.core.service.MenuService;
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
