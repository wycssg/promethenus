package com.guava.string;

import com.google.common.base.Joiner;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/8/3 13:21
 */
public class JoinerDemo {
    public static void main(String[] args) {
        Joiner joiner1 = Joiner.on(";").skipNulls();
        String join1 = joiner1.join("Harry", "bob", "Ron", null, "heluo");
        System.out.println(join1);

        Joiner joiner2 = Joiner.on(";").useForNull("null");
        String join2 = joiner2.join("Harry", "bob", "Ron", null, "heluo");
        System.out.println(join2);

        Joiner joiner3 = Joiner.on(";");
        //没有处理null，会报异常
        String join3 = joiner3.join("Harry", "bob", "Ron", null, "heluo");
        System.out.println(join3);
    }
}
