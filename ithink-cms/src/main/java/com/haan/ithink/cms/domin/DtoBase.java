package com.haan.ithink.cms.domin;

import lombok.Data;

/**
 * @author Lkhan
 */
@Data
public abstract class DtoBase<Tkey> {
    private Tkey id;
}
