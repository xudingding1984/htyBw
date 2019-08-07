package com.hyt.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 查询基类
 *
 * @author rick
 */
public class BaseVo {

    /**
     * 页数
     * <p>如果要设定pageSize,必须先指定pageSize，后指定pageNo</p>
     */
    @JsonIgnore
    public Integer pageSize;

    /**
     * 页码
     */
    @JsonIgnore
    public Integer pageNo;

    /**
     * 排序字段
     */
    @JsonIgnore
    public String pageSort;

    /**
     * sql [start],limit
     */
    @JsonIgnore
    public Integer pageStart;

	@JsonIgnore
	public String orderByClause;

    public BaseVo() {
        if (pageSize == null) {
            this.pageSize = 10;
        }
        if (pageNo == null) {
            this.pageNo = 1;
            this.pageStart = 0;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if (pageSize == null) {
            this.pageSize = 10;
        }
        if (pageNo != null && pageNo > 0) {
            this.pageNo = pageNo;
            this.pageStart = (pageNo - 1) * this.pageSize;
        } else {
            this.pageNo = 1;
            this.pageStart = 0;
        }
    }

    public String getPageSort() {
        return pageSort;
    }

    public void setPageSort(String pageSort) {
        this.pageSort = pageSort;
    }

    public Integer getPageStart() {
        return pageStart;
    }

    public void setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
    }

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
}
