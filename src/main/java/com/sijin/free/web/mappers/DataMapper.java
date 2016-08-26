package com.sijin.free.web.mappers;

import com.sijin.free.web.common.domain.*;

import java.util.List;

/**
 * 获取数据
 * Author tuijiang
 * Date 16/4/12
 */
public interface DataMapper {

    List<Verdict> queryVerdict(BaseRequest baseRequest);

    List<Verdict> sumVerdict(BaseRequest baseRequest);

    List<Audit> queryAudit(BaseRequest baseRequest);

    List<Media> queryMedia(BaseRequest baseRequest);

    List<Editor> queryEditor(BaseRequest baseRequest);

    int countVerdict(BaseRequest baseRequest);

    int countSumVerdict(BaseRequest baseRequest);

    int countAudit(BaseRequest baseRequest);

    int countMedia(BaseRequest baseRequest);

    int countEditor(BaseRequest baseRequest);
}
