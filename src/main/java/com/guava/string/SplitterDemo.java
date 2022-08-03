package com.guava.string;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/8/3 13:24
 */
public class SplitterDemo {
    public static void main(String[] args) {
        String re = ",a,,b,";
        String[] split = re.split(",");
        //[, a, , b] 很古怪，头部不会丢弃，尾部丢弃了
        System.out.println(Arrays.toString(Arrays.stream(split).toArray()));

        //[, a, , b, ]包含头部和尾部
        List<String> strings = Splitter.on(",").splitToList(re);
        System.out.println(strings);

//        Iterable<String> split1 = Splitter.on(",").split(re);
//        split1.forEach(System.out::println);
        //[a, b]忽略空字符串
        List<String> strings1 = Splitter.on(",").omitEmptyStrings().splitToList(re);
        System.out.println(strings1);
        //[a, b]忽略掉字符串中的空格
        List<String> strings2 = Splitter.on(",").omitEmptyStrings().trimResults().splitToList(re);
        System.out.println(strings2);
    }
}
