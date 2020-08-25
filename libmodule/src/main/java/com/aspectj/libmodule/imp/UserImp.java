package com.aspectj.libmodule.imp;

import com.aspectj.annotation.ClassAnnotation;
import com.aspectj.annotation.MethodAnnotation;
import com.aspectj.practice.framework.interfaces.User;

/**
 * @author shhe
 * @Date 2020/8/10 下午4:31
 * @Description:
 */
@ClassAnnotation(note = "UserImp")
public class UserImp implements User {

    @Override
    public int add(int userId) {
        return 4;
    }

    @Override
    public <T> T sub(T param) {
        return param;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    private void transform() {

    }

    @MethodAnnotation(note = "addAttribute")
    public void addAttribute(int position) {

    }
}
