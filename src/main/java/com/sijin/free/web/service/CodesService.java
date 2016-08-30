package com.sijin.free.web.service;

import com.sijin.free.web.mappers.CodesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sijinzhang on 16/8/30.
 */

@Service
public class CodesService {
    @Resource
    private CodesMapper codesMapper;

}
