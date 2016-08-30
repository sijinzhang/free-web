package com.sijin.free.web.service;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.DockInfo;
import com.sijin.free.web.mappers.DockInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class DockInfoService {

    @Resource
    private DockInfoMapper dockInfoMapper;

    public int countOptional(BaseRequest baseRequest) {
        return dockInfoMapper.countOptional(baseRequest);
    }

    public List<DockInfo> optional(BaseRequest baseRequest) {
        return dockInfoMapper.selectOptional(baseRequest);
    }
}
