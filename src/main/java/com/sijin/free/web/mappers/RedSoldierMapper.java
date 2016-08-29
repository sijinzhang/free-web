package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.RedSoldier;

public interface RedSoldierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RedSoldier record);

    int insertSelective(RedSoldier record);

    RedSoldier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RedSoldier record);

    int updateByPrimaryKey(RedSoldier record);
}