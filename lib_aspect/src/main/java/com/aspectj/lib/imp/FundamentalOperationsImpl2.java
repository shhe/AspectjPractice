package com.aspectj.lib.imp;

import com.aspectj.annotation.ParamAnnotation;
import com.aspectj.practice.framework.interfaces.FundamentalOperations;

/**
 * @author shhe
 * @Date 2020/8/25 上午9:58
 * @Description:
 */
public class FundamentalOperationsImpl2 implements FundamentalOperations {

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public long multi(@ParamAnnotation(note = "param one")long a, @ParamAnnotation(note = "param one")long b) {
        return a * b;
    }

    public long multi2(@ParamAnnotation(note = "param one")long a) {
        return 2*a;
    }
}
