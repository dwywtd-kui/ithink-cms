package com.haan.ithink.cms.service.impl;

import com.haan.ithink.cms.ModelMapperUtils;
import com.haan.ithink.cms.domin.DtoBase;
import com.haan.ithink.cms.domin.EntityBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description com.inspur.edp.epp.framework.core.domain
 * Created by chengch
 * date on 2019/11/7
 */
public abstract class CrudAppServiceBase<TRepository extends JpaRepository<TEntity,TKey>,TEntity extends EntityBase<TKey>,TDto extends DtoBase<TKey>,TKey extends Serializable> {

    protected TRepository repository;

    public CrudAppServiceBase(TRepository repository) {
        this.repository = repository;
    }


    public List<TDto> findAll(){
        List<TEntity> entities = repository.findAll();
        return entities.stream().map(s->map(s)).collect(Collectors.toList());
    }


    public TDto findById(TKey id){
        TEntity entity = repository.findById(id).orElse(null);
        return map(entity);
    }

    /**
     * 新增
     * @param dto
     * @return
     */
    public TDto create(TDto dto){
        TEntity entity = map(dto);
        TEntity saveEntity = repository.save(entity);
        return map(saveEntity);
    }

    /**
     * 更新
     * @param dto
     * @return
     */
    public TDto update(TDto dto){
        TEntity entity = map(dto);
        repository.save(entity);
        return map(entity);
    }

    /**
     * 通过Id删除
     * @param id primaryKey
     */
    public void deleteById(TKey id){
        repository.deleteById(id);
    }

    /**
     * 删除实体
     * @param dto
     */
    public void delete(TDto dto){
        this.deleteById(dto.getId());
    }

    /**
     * 批量删除
     * @param ids
     */
    public void deleteInBatch(List<TKey> ids){
        List<TEntity> entities = this.repository.findAllById(ids);
        this.repository.deleteInBatch(entities);
    }


    protected TEntity map(TDto dto){
        if (dto == null) return null;
        return ModelMapperUtils.map(dto,getEntityType());
    }

    protected TDto map(TEntity entity){
        if(entity == null) return null;
        return ModelMapperUtils.map(entity,getDtoType());
    }


    protected abstract Class<TEntity> getEntityType();
    protected abstract Class<TDto> getDtoType();

}
