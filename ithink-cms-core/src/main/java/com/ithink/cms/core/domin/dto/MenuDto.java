package com.ithink.cms.core.domin.dto;

import com.ithink.cms.core.domin.DtoBase;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hanliukui
 * @Date 2020/8/23 14:51
 */
@Setter
@Getter
public class MenuDto extends DtoBase<Long> {

    private Boolean open = true;
}
