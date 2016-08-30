package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.Dockma;

import java.util.List;

public interface DockmaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dockma record);

    int insertSelective(Dockma record);

    Dockma selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dockma record);

    int updateByPrimaryKey(Dockma record);

    List<Dockma> selectDailyback(BaseRequest baseRequest);

    int countDailyreback(BaseRequest baseRequest);
}