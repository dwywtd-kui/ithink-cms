package com.ithink.cms.core.domin;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Lkhan
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/10
 */
@Setter
@Getter
public class TreeEntityDto<T,Tkey> extends DtoBase<Tkey> {
    /**
     * 父节点ID
     */
    protected Tkey parentId;

    /**
     * children
     */
    protected List<T> children;
    /**
     * 分级路径
     */
    protected String path;
    /**
     * 级数
     */
    protected int tlevel;
    /**
     * 是否叶子结点
     */
    protected boolean isLeaf;

    /**
     * 排序顺序
     */
    protected Integer sortOrder;

    private Tkey storeId;
}
