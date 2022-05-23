package com.sunflower.ithink.cms.web.domin;

import lombok.Data;

/**
 * @author Lkhan
 */
@Data
public abstract class DtoBase<Tkey> {
    private Tkey id;
}
