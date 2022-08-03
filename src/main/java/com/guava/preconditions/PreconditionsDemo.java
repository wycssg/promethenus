package com.guava.preconditions;

import com.google.common.base.Preconditions;

import java.util.ArrayList;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 17:46
 */
public class PreconditionsDemo {
    public static void main(String[] args) {
        Preconditions.checkArgument(true);
        Preconditions.checkNotNull("1");
        Preconditions.checkState(true);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        Preconditions.checkElementIndex(0,objects.size());


    }
}
