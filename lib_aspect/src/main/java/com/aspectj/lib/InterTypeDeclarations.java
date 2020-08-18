package com.aspectj.lib;

import com.aspectj.lib.interfaces.IHasName;
import com.aspectj.lib.vo.Point;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

import java.util.Vector;

/**
 * @author shhe
 * @Date 2020/8/12 上午11:28
 * @Description: 类型间声明
 */
@Aspect
public class InterTypeDeclarations {

    /**
     * 所有的Point类及其子类都在运行时实现 IHasName 接口
     */
//    @DeclareParents(value = "com.aspectj.lib.vo.Point..*", defaultImpl = IHasName.class)
//    public Point mPoint;

//    private Vector Po
}
