package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.DockInfo;

import java.util.List;

public interface DockInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DockInfo record);

    int insertSelective(DockInfo record);

    DockInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DockInfo record);

    int updateByPrimaryKey(DockInfo record);

    int countOptional(BaseRequest baseRequest);
    List<DockInfo> selectOptional(BaseRequest baseRequest);


}