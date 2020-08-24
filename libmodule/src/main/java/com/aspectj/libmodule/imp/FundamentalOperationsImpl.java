package com.aspectj.libmodule.imp;

/**
 * @author shhe
 * @Date 2020/8/22 下午3:09
 * @Description:
 */
public class FundamentalOperationsImpl extends BaseFundamentalOperationsImpl {

    private Integer mIntField;
    private Long mLongField;
    private float mFloatField;
    private Double mDoubleField;

    public FundamentalOperationsImpl() {
        super();
        mIntField = new Integer(0);
        mLongField = 0l;
        mFloatField = 0f;
        mDoubleField = 0d;
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public long multi(long a, long b) {
        return 0;
    }
}
