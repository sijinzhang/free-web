package com.sijin.free.web.service;

import com.sijin.free.web.common.domain.BaseRequest;
import com.sijin.free.web.common.domain.Dockma;
import com.sijin.free.web.mappers.DockmaMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class DockmaService {

    @Resource
    private DockmaMapper dockmaMapper;


    public List<Dockma> dailyreback(BaseRequest baseRequest) {
        return dockmaMapper.selectDailyback(baseRequest);
    }

    public int countDailyreback(BaseRequest baseRequest) {
        return dockmaMapper.countDailyreback(baseRequest);
    }
}
