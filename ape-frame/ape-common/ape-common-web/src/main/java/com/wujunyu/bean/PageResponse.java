package com.wujunyu.bean;

import java.util.Collections;
import java.util.List;

public class PageResponse<T> {

    private Integer pageNo = 1;
    private Integer pageSize = 10;
    private Integer total = 0;
    private Integer totalPages = 0;
    private List<T> result = Collections.emptyList();
    private Integer start = 1;
    private Integer end = 0;

    public PageResponse() {}

    public void setCurrent(Integer pageNo) {
        if (pageNo != null && pageNo > 0) {
            this.pageNo = pageNo;
        }
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize > 0) {
            this.pageSize = pageSize;
        }
    }

    public void setRecords(List<T> result) {
        this.result = result;
        if (result != null && result.size() > 0 && this.total == 0) {
            setTotal(result.size());
        }
    }

    public void setTotal(Integer total) {
        this.total = total;
        if (total == -1) {
            this.pageNo = 1;
            return ;
        }
        if (this.pageSize > 0) {
            this.totalPages = (total / this.pageSize) + (total % this.pageSize == 0 ? 0 : 1);
        } else {
            this.totalPages = 0;
        }
        this.start = (this.pageNo > 0 ? this.pageNo - 1 : 0) * this.pageSize + 1;
        this.end = (this.start - 1 + this.pageSize * (this.pageNo > 0 ? 1 : 0));
    }

}
