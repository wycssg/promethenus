package com.batch.processor;

import com.example.generator.base.entity.TbaseCompany;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 15:49
 */
@Component
public class TestDataFilterItemProcessor implements ItemProcessor<TbaseCompany, TbaseCompany> {
    @Override
    public TbaseCompany process(TbaseCompany tbaseCompany) {
        // 返回null，会过滤掉这条数据
        return "".equals(tbaseCompany.getCompanyCode()) ? null : tbaseCompany;
    }
}
