package com.sijin.free.web.controller;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sijin.free.web.common.domain.*;
import com.sijin.free.web.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/monitor")
public class DataController {
    @Autowired
    private DataService dataService;
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static Logger LOGGER = LoggerFactory.getLogger(DataController.class);

    /**
     * @return
     */
    @RequestMapping(value = "/redSoldier")
    @ResponseBody
    public String redSoldier(BaseRequest baseRequest) throws ParseException {
        int page = baseRequest.getPage();
        int start = baseRequest.getPage() * baseRequest.getPagePerSize();
        baseRequest.setPage(start);
        baseRequest = transeDateAndSet(baseRequest);

        List<RedSoldier> result = dataService.redSoldier(baseRequest);
        int count = dataService.countRedSoldier(baseRequest);

        return getResponse(page, count, baseRequest.getPagePerSize(), result);
    }

    /**
     * @return
     */
    @RequestMapping(value = "/realtime")
    @ResponseBody
    public String realtime(BaseRequest baseRequest) {
        int page = baseRequest.getPage();
        int start = baseRequest.getPage() * baseRequest.getPagePerSize();
        baseRequest.setPage(start);
        baseRequest = transeDateAndSet(baseRequest);

        List<DockRealTime> result = dataService.realtime(baseRequest);
        int count = dataService.countRealtime(baseRequest);

        return getResponse(page, count, baseRequest.getPagePerSize(), result);
    }

    /**
     * @return
     */
    @RequestMapping(value = "/dailyreback")
    @ResponseBody
    public String dailyreback(BaseRequest baseRequest) {
        int page = baseRequest.getPage();
        int start = baseRequest.getPage() * baseRequest.getPagePerSize();
        baseRequest.setPage(start);
        baseRequest = transeDateAndSet(baseRequest);

        List<Dockma> result = dataService.dailyreback(baseRequest);
        int count = dataService.countDailyreback(baseRequest);

        return getResponse(page, count, baseRequest.getPagePerSize(), result);
    }

    /**
     * @return
     */
    @RequestMapping(value = "/optional")
    @ResponseBody
    public String optional(BaseRequest baseRequest) {
        int page = baseRequest.getPage();
        int start = baseRequest.getPage() * baseRequest.getPagePerSize();
        baseRequest.setPage(start);
        baseRequest = transeDateAndSet(baseRequest);

        System.out.println(baseRequest);
        LOGGER.info("{}", baseRequest);
        List<DockInfo> result =  dataService.optional(baseRequest);
        int count = dataService.countOptional(baseRequest);

        return getResponse(page, count, baseRequest.getPagePerSize(), result);
    }

    private <T> String getResponse(int page, int count, int perSize, List<T> result) {
        BaseResponse baseResponse = new BaseResponse(result);
        baseResponse.setPage(page);
        baseResponse.setCount(count);

        int pageSize = count / perSize == 0 ? 1 : count / perSize + 1;
        baseResponse.setPageSize(pageSize);
        return gson.toJson(baseResponse);
    }


    private BaseRequest transeDateAndSet(BaseRequest baseRequest) {
        try {
            if (!Strings.isNullOrEmpty(baseRequest.getBeginDateParam()) && !Strings.isNullOrEmpty(baseRequest.getEndDateParam())) {
                Date beginDate = simpleDateFormat.parse(baseRequest.getBeginDateParam());
                Date endDate = simpleDateFormat.parse(baseRequest.getEndDateParam());
                baseRequest.setBeginDate(beginDate);
                baseRequest.setEndDate(endDate);
            }
        } catch (Exception ex) {
        }
        return baseRequest;
    }
}
