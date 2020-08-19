package com.aspectj.libmodule;

import com.aspectj.annotation.Page;

/**
 * @author shhe
 * @Date 2020/8/18 下午7:39
 * @Description:
 */
@Page(name = "ComputeOption")
public class ComputeOption {

    public int add(int a, int b) {
        return a+b;
    }
}
