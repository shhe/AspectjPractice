package com.aspectj.lib;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author shhe
 * @Date 2020/8/10 下午8:07
 * @Description:
 */
@Aspect
public class ParameterPassing {

    public static final String TAG = "ParameterPassing";

    /*@Before(value = "args(param)", argNames = "param")
    public void BeforeAdd(JoinPoint joinPoint, int param) {
        Log.i(TAG, "BeforeAdd: "*//*+joinPoint.getTarget().toString()*//* + "param:"+param);
    }*/

    @Pointcut("execution(* com.aspectj.practice.interfaces.User.add(..))")
//    @Pointcut("execution(* com.aspectj.practice.interfaces.User.add(..)) && args(userId, ..)")
    public void addOfUserPointcut() {

    }

    @Before(value = "addOfUserPointcut()")
    public void BeforeAdd(JoinPoint joinPoint) {
//        Log.i(TAG, "userId:"+userId);
        Object[] paramValues = joinPoint.getArgs();
//        String[] paramNames = joinPoint.getStaticPart().getSignature().
        for(int i=0;i<paramValues.length;i++){
            Log.i(TAG, "paramValues: "+paramValues[i]);
        }
    }
}
