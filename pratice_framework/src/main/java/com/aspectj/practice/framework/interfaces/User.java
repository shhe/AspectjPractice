package com.aspectj.practice.framework.interfaces;

/**
 * @author shhe
 * @Date 2020/8/10 下午4:30
 * @Description:
 */
public interface User {

    int add(int userId);

    <T> T sub(T param);

    void update();

    void delete();
}
