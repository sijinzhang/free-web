package com.sijin.free.web.service;
import com.sijin.free.web.common.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tuijiang on 16/4/13.
 */
@Service
public class DataService {


    @Autowired
    private DockmaService dockmaService;

    @Autowired
    private DockInfoService dockInfoService;

    @Autowired
    private RedSoldierService redSoldierService;

    @Autowired
    private DockRealTimeService dockRealTimeService;


    public List<Dockma> dailyreback(BaseRequest baseRequest) {
        return dockmaService.dailyreback(baseRequest);
    }
    public int countDailyreback(BaseRequest baseRequest) {
        return dockmaService.countDailyreback(baseRequest);
    }

    public List<DockInfo> optional(BaseRequest baseRequest) {
        return dockInfoService.optional(baseRequest);
    }

    public int countOptional(BaseRequest baseRequest) {
        return dockInfoService.countOptional(baseRequest);
    }
    

    public List<RedSoldier> redSoldier(BaseRequest baseRequest) {
        return redSoldierService.redSoldier(baseRequest);
    }

    public int countRedSoldier(BaseRequest baseRequest) {
        return redSoldierService.countRedSoldier(baseRequest);
    }


    public List<DockRealTime> realtime(BaseRequest baseRequest) {
        return dockRealTimeService.realtime(baseRequest);
    }

    public int countRealtime(BaseRequest baseRequest) {
        return dockRealTimeService.countRealtime(baseRequest);
    }
}
