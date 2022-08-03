package com.guava.ordering;

import com.example.generator.base.entity.TbaseCompany;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TODO 一句话描述
 *
 * @author heluo
 * 2022/7/28 20:23
 */
public class OrderDemo {
    public static void main(String[] args) {
        Ordering<String> byLengthOrdering = new Ordering<String>() {
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
        ArrayList<String> strings = new ArrayList<>();
        strings.sort(byLengthOrdering);


        //当阅读链式调用产生的排序器时，应该从后往前读。上面的例子中，排序器首先调用apply方法获取sortedBy值，
        //并把sortedBy为null的元素都放到最前面，然后把剩下的元素按sortedBy进行自然排序。之所以要从后往前读，是因为每次链式调用都是用后面的方法包装了前面的排序器。
        Ordering<TbaseCompany> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<TbaseCompany, String>() {
            public String apply(TbaseCompany company) {
                return company.getCompanyCode();
            }
        });
        ArrayList<TbaseCompany> companies = new ArrayList<>();
        companies.sort(ordering);

    }

    Ordering<String> byLengthOrdering = new Ordering<String>() {
        public int compare(String left, String right) {
            return Ints.compare(left.length(), right.length());
        }
    };
}
