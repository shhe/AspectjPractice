package com.aspectj.lib;

import android.os.Bundle;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author shhe
 * @Date 2020/8/13 下午4:23
 * @Description: 页面停留时长统计
 */
@Aspect
public class TackPage {

    public static final String TAG = "TackPage";

    /**
     * 匹配 AppCompatActivity 类及其子类的 onCreate 方法的执行
     */
    @Pointcut("execution(protected void onCreate(..)) && target(androidx.appcompat.app.AppCompatActivity+) && args(bundle)")
    public void callOnCreate(Bundle bundle) {

    }

    @Before(value = "callOnCreate(bundle)")
    public void beforePointcut(JoinPoint joinPoint, Bundle bundle) {
        Log.i(TAG, "... beforePointcut ... "+joinPoint.getSignature().getName()+" "+joinPoint.getSourceLocation());
    }

    @Pointcut("execution(* *.onCreate(..))")
    public void onCreatePointcut() {

    }

    @After(value = "onCreatePointcut()")
    public void afterOnCreate(JoinPoint joinPoint) {
        Log.i(TAG, "... onCreate ... "+joinPoint.getSignature());
    }
}
