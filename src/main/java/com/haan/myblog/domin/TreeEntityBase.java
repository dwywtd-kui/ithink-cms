package com.haan.myblog.domin;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/10
 */

@MappedSuperclass
public class TreeEntityBase<T,Tkey> extends EntityBase<Tkey> {
    /**
     * 父节点ID
     */
    @Column(name = "parentId")
    protected Tkey parentId;

    /**
     * 父节点
     */
    @Transient
    protected T parent;

    /**
     * children
     */
    @Transient
    protected List<T> children = new ArrayList<>();
    /**
     * 分级路径
     */
    protected String path;
    /**
     * 级数
     */
    @Column(nullable = true)
    protected int tlevel;
    /**
     * 是否叶子结点
     */
    protected boolean isLeaf;

    /**
     * 排序顺序
     */
    protected Integer sortOrder;

    @Column(name = "storeid")
    protected Tkey storeId;

    public Tkey getParentId() {
        return parentId;
    }

    public void setParentId(Tkey parentId) {
        this.parentId = parentId;
    }

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getTlevel() {
        return tlevel;
    }

    public void setTlevel(int tlevel) {
        this.tlevel = tlevel;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Tkey getStoreId() {
        return storeId;
    }

    public void setStoreId(Tkey storeId) {
        this.storeId = storeId;
    }
}
