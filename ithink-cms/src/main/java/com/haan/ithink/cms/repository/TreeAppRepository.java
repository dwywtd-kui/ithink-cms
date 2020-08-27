package com.haan.ithink.cms.repository;


import com.haan.ithink.cms.domin.TreeEntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface TreeAppRepository<T extends TreeEntityBase<T,ID>,ID> extends JpaRepository<T,ID> {
    List<T> findAllByParentId(ID parentId);
    void deleteByParentId(ID parentId);
    List<T> findAllByStoreIdOrderBySortOrderAsc(ID storeId);
}
