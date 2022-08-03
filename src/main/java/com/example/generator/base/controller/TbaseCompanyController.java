package com.example.generator.base.controller;

import com.example.generator.base.service.ITbaseCompanyService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * <p>
 * 企业信息表 前端控制器
 * </p>
 *
 * @author wyc
 * @since 2022-07-28
 */
@RestController
@RequestMapping("/base/tbaseCompany")
public class TbaseCompanyController {
    @Resource(name = "tbaseCompanyServiceImpl")
    private ITbaseCompanyService tbaseCompanyService;
    @Resource
    private MeterRegistry meterRegistry;
    private Counter counter;

    @PostConstruct
    public void init() {
        Tags tags = Tags.of("common", "test");
        // 公共标签
        meterRegistry.config().commonTags(tags);
        //http://localhost:8088/actuator/prometheus查看暴露指标，关键字metrics_request_common
        counter = Counter.builder("metrics_request_common").register(meterRegistry);
    }

    @RequestMapping("count")
    public Long count(){
        counter.increment();
        return tbaseCompanyService.count();
    }
}
