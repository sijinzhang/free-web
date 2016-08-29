package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.DockInfo;

public interface DockInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DockInfo record);

    int insertSelective(DockInfo record);

    DockInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DockInfo record);

    int updateByPrimaryKey(DockInfo record);
}