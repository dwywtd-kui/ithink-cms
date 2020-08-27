package com.haan.ithink.cms.domin;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Lkhan
 */
@MappedSuperclass
@Data
public abstract class EntityBase<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private T id;
}
