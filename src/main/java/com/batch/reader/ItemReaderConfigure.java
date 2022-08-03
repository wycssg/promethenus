package com.batch.reader;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.generator.base.entity.TbaseCompany;
import com.example.generator.base.service.ITbaseCompanyService;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.List;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 15:22
 */
@Configuration
public class ItemReaderConfigure {
    @Resource(name = "tbaseCompanyServiceImpl")
    private ITbaseCompanyService iTbaseCompanyService;

    @Bean
    public ListItemReader<TbaseCompany> simpleReader() {
        QueryWrapper<TbaseCompany> wrapper = new QueryWrapper();
        List<TbaseCompany> list = iTbaseCompanyService.list(wrapper);
        return new ListItemReader<>(list);
    }
}
