package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.RedSoldier;

import java.util.List;

public interface RedSoldierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RedSoldier record);

    int insertSelective(RedSoldier record);

    RedSoldier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RedSoldier record);

    int updateByPrimaryKey(RedSoldier record);

    List<RedSoldier> selectRedSoldier(BaseRequest baseRequest);

    int countRedSoldier(BaseRequest baseRequest);
}