package com.sijin.free.web.service;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.RedSoldier;
import com.sijin.free.web.mappers.RedSoldierMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class RedSoldierService {
    @Resource
    private RedSoldierMapper redSoldierMapper;

    public List<RedSoldier> redSoldier(BaseRequest baseRequest) {
        return redSoldierMapper.selectRedSoldier(baseRequest);
    }

    public int countRedSoldier(BaseRequest baseRequest) {
        return redSoldierMapper.countRedSoldier(baseRequest);
    }
}
