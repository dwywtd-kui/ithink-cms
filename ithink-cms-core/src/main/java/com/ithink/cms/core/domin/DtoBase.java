package com.ithink.cms.core.domin;

import lombok.Data;

/**
 * @author Lkhan
 */
@Data
public abstract class DtoBase<Tkey> {
    private Tkey id;
}
