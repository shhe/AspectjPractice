package com.aspectj.practice.imp;

import com.aspectj.annotation.ParamAnnotation;
import com.aspectj.practice.framework.interfaces.FundamentalOperations;

/**
 * @author shhe
 * @Date 2020/8/12 上午10:11
 * @Description:
 */
public class FundamentalOperationsImpl implements FundamentalOperations {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public long multi(@ParamAnnotation(note = "param one")long a, long b) {
        return a * b;
    }
}
