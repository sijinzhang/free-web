package com.sijin.free.web.service;
import com.sijin.free.web.common.domain.*;
import com.sijin.free.web.mappers.DataMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tuijiang on 16/4/13.
 */
@Service
public class DataService {
    @Resource
    private DataMapper dataMapper;

    public List<Verdict> queryVerdict(BaseRequest baseRequest) {
        if (baseRequest.getType() == 0) {
            return dataMapper.sumVerdict(baseRequest);
        } else {
            return dataMapper.queryVerdict(baseRequest);
        }
    }

    public List<Audit> queryAudit(BaseRequest baseRequest) {
        return dataMapper.queryAudit(baseRequest);
    }

    public List<Media> queryMedia(BaseRequest baseRequest) {
        return dataMapper.queryMedia(baseRequest);
    }

    public List<Editor> queryEditor(BaseRequest baseRequest) {
        return dataMapper.queryEditor(baseRequest);
    }

    public int countVerdict(BaseRequest baseRequest) {
        if(baseRequest.getType() ==0) {
            return dataMapper.countSumVerdict(baseRequest);
        } else {
            return dataMapper.countVerdict(baseRequest);
        }
    }

    public int countAudit(BaseRequest baseRequest) {
        return dataMapper.countAudit(baseRequest);
    }

    public int countMedia(BaseRequest baseRequest) {
        return dataMapper.countMedia(baseRequest);
    }

    public int countEditor(BaseRequest baseRequest) {
        return dataMapper.countEditor(baseRequest);
    }
}
