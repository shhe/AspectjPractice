package com.aspectj.lib;

import android.os.Bundle;
import android.util.Log;

import com.aspectj.annotation.Page;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author shhe
 * @Date 2020/8/13 下午4:23
 * @Description: 页面停留时长统计
 */
@Aspect
public class TackPage {

    public static final String TAG = "TackPage";

    public static final String EXECTION_ONCREATE = "execution(protected void onCreate(..)) && args(bundle) && target(androidx.appcompat.app.AppCompatActivity+)";

    /**
     * 匹配 AppCompatActivity 类及其子类的 onCreate 方法的执行
     */
    @Pointcut(EXECTION_ONCREATE)
    public void enterPagePointcut(Bundle bundle) {

    }

    @Before(value = "enterPagePointcut(bundle)")
    public void enterPage(JoinPoint joinPoint, Bundle bundle) {
        Log.i(TAG, "... enterPage ... "+joinPoint.getSignature().getName()+" "+joinPoint.getSourceLocation());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Page page = method.getAnnotation(Page.class);
        if (page == null) {
            page = joinPoint.getTarget().getClass().getAnnotation(Page.class);
            if (page != null) {
                Log.i(TAG, "enterPage: "+page.name());
            }
        }
    }
}
