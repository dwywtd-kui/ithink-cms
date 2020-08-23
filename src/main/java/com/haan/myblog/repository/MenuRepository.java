package com.haan.myblog.repository;

import com.haan.myblog.domin.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:56
 */
public interface MenuRepository extends JpaRepository<Menu,Long> {
}
