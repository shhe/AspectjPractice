package com.aspectj.lib;

import android.util.Log;

import com.aspectj.lib.annotation.MethodAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author shhe
 * @Date 2020/8/19 下午4:35
 * @Description:
 */
@Aspect
public class GetAnnotationValue {

/*    public static final String TAG = "GetAnnotationValue";

    *//**
     * 匹配任意实现了接口User的目标对象的方法并且方法使用了注解 MethodAnnotation
     *//*
    @Pointcut("target(com.aspectj.practice.interfaces.User) && @annotation(com.aspectj.lib.annotation.MethodAnnotation)")
    public void withOperatorPointcut(MethodAnnotation annotation) {

    }*/

/*    @After(value = "withOperatorPointcut() && @annotation(annotation)")
    public void afterWithOperator(MethodAnnotation annotation) {
        Log.i(TAG, "afterWithOperator: "+annotation.note());
    }*/
}
