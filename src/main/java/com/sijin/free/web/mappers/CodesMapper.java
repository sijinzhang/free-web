package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.Codes;

import java.util.List;

public interface CodesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Codes record);

    int insertSelective(Codes record);

    Codes selectByPrimaryKey(Long id);

    List<Codes> selectByLevel(Integer followLevel);

    int updateByPrimaryKeySelective(Codes record);

    int updateByPrimaryKey(Codes record);

    int countSelectByLevel(int level);
}