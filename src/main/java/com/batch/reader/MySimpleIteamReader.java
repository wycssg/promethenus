package com.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.Iterator;
import java.util.List;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 14:05
 */
public class MySimpleIteamReader implements ItemReader<String> {
    private Iterator<String> iterator;

    public MySimpleIteamReader(List<String> data) {
        this.iterator = data.iterator();
    }

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        // 数据一个接着一个读取
        return iterator.hasNext() ? iterator.next() : null;
    }
}
