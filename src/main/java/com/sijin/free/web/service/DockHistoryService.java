package com.sijin.free.web.service;

import com.sijin.free.web.mappers.DockHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class DockHistoryService {

    @Resource
    private DockHistoryMapper dockHistoryMapper;
}
