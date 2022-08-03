package com.guava.objects;


import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 17:53
 */
public class ObjectsDemo {
    public static void main(String[] args) {
        Objects.equal("a", "a");
        Objects.equal(null, "a");

        Objects.hashCode("a");

        //比较链
        int result = ComparisonChain.start().compare(1, 1).compare(2,1).result();
        System.out.println(result);
    }
}
