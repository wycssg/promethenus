package com.guava.ImmutableSet;

import com.google.common.collect.ImmutableSet;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 20:38
 */
public class ImmutableSetDemo {
    public static void main(String[] args) {
        ImmutableSet<String> stringImmutableSet = ImmutableSet.of("red", "green", "blue");
        System.out.println(stringImmutableSet);
    }
}
