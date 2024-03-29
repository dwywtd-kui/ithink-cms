package com.ithink.cms.core.service;


import com.ithink.cms.core.domin.TreeEntityDto;

import java.util.List;
import java.util.Map;

public interface ITreeAppService<TEntityDto extends TreeEntityDto<TEntityDto,TKey>,TKey> extends ICrudAppService<TEntityDto,TKey>{
    TEntityDto  addChild(TEntityDto dto,TKey key);
    TEntityDto  addSibling(TEntityDto dto,TKey key);
    TEntityDto addFirstRoot(TEntityDto dto);
    void delete(TKey id);

    List<TEntityDto> findAllWithTree();

    TEntityDto findByIdAndOffSpringWithTree(TKey id);
    List<TEntityDto> findByIdAndOffSpring(TKey id);

    TEntityDto findByIdAndChildrenWithTree(TKey id);
    List<TEntityDto> findByIdAndChildren(TKey id);

    List<TEntityDto> findByStoreId(TKey id);
    List<TEntityDto> findByStoreIdWithTree(TKey id);

    TEntityDto findParentDtoOrNull(TKey id);
    List<TEntityDto> findChildren(TKey key);

    List<TEntityDto > getTree(Map<String,Object> params);
}

