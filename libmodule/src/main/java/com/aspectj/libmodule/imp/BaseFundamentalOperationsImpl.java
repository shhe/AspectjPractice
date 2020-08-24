package com.aspectj.libmodule.imp;

import com.aspectj.practice.framework.interfaces.FundamentalOperations;

/**
 * @author shhe
 * @Date 2020/8/22 下午3:13
 * @Description:
 */
public class BaseFundamentalOperationsImpl/* implements FundamentalOperations*/ {

    private Integer mIntField;
    private Long mLongField;
    private float mFloatField;
    private Double mDoubleField;

    public BaseFundamentalOperationsImpl() {
        mIntField = new Integer(0);
        mLongField = 0l;
        mFloatField = 0f;
        mDoubleField = 0d;
    }

    public int add(int a, int b) {
        return 0;
    }

    public int sub(int a, int b) {
        return 0;
    }

    public long multi(long a, long b) {
        return 0;
    }
}
