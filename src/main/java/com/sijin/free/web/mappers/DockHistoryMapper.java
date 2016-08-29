package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.DockHistory;

import java.util.List;


public interface DockHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DockHistory record);

    int insertSelective(DockHistory record);

    DockHistory selectByPrimaryKey(Long id);

    List<DockHistory> selectByDockHistory(DockHistory dockHistory);

    int updateByPrimaryKeySelective(DockHistory record);

    int updateByPrimaryKey(DockHistory record);
}