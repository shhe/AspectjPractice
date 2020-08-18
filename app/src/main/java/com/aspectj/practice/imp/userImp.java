package com.aspectj.practice.imp;

import com.aspectj.lib.annotation.ClassAnnotation;
import com.aspectj.lib.annotation.MethodAnnotation;
import com.aspectj.practice.interfaces.User;

/**
 * @author shhe
 * @Date 2020/8/10 下午4:31
 * @Description:
 */
@ClassAnnotation
class userImp implements User {

    @Override
    public int add(int userId) {
        return 4;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    private void transform() {

    }

    @MethodAnnotation
    public void addAttribute(int position) {

    }
}
