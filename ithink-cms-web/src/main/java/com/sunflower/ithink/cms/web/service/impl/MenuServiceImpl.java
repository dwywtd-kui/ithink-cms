package com.sunflower.ithink.cms.web.service.impl;

import com.sunflower.ithink.cms.web.domin.dto.MenuDto;
import com.sunflower.ithink.cms.web.domin.entity.Menu;
import com.sunflower.ithink.cms.web.repository.MenuRepository;
import com.sunflower.ithink.cms.web.service.MenuService;
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
