package com.haan.myblog.repository;


import com.haan.myblog.domin.TreeEntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface TreeAppRepository<T extends TreeEntityBase<T,ID>,ID> extends JpaRepository<T,ID> {
    List<T> findAllByParentId(ID parentId);
    void deleteByParentId(ID parentId);
    List<T> findAllByStoreId(ID storeId);
}
