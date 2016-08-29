package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.Dockma;

public interface DockmaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dockma record);

    int insertSelective(Dockma record);

    Dockma selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dockma record);

    int updateByPrimaryKey(Dockma record);
}