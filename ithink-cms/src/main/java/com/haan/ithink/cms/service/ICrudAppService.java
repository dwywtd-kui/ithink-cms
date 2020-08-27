package com.haan.ithink.cms.service;


import com.haan.ithink.cms.domin.DtoBase;

import java.util.List;


/**
 * @author hanliukui
 */
public interface ICrudAppService<TDto extends DtoBase<TId>, TId> {

    /**
     * 查找所有
     * @return
     */
    List<TDto> findAll();

    /**
     * 通过Id进行查询
     * @param id
     * @return
     */
    TDto findById(TId id);

    /**
     * 创建
     * @param dto
     * @return
     */
    TDto create(TDto dto);

    /**
     * 更新
     * @param dto
     * @return
     */
    TDto update(TDto dto);

    /**
     * 删除，dto中只需要带着id即可
     * @param dto
     */
    void delete(TDto dto);

    /**
     * 批量删除
     * @param ids
     */
    void deleteInBatch(List<TId> ids);

}
