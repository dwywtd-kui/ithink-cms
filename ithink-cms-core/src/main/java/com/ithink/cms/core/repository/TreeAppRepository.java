package com.ithink.cms.core.repository;


import com.ithink.cms.core.domin.TreeEntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface TreeAppRepository<T extends TreeEntityBase<T,ID>,ID> extends JpaRepository<T,ID> {
    List<T> findAllByParentId(ID parentId);
    void deleteByParentId(ID parentId);
    List<T> findAllByStoreIdOrderBySortOrderAsc(ID storeId);
}
