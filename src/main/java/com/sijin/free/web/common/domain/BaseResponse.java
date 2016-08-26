package com.sijin.free.web.common.domain;

import java.util.List;

/**
 * Author tuijiang
 * Date 16/4/13
 */
public class BaseResponse<T> {
    private int page;
    private int count;
    private int pageSize;
    private List<T> result;

    public BaseResponse(List<T> result) {
        this.result = result;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
