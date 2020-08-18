package com.aspectj.practice;

import android.content.Context;
import android.os.Build;

/**
 * @author shhe
 * @Date 2020/8/14 下午1:24
 * @Description:
 */
class Utils {
    public static boolean isXiaoMi() {
        return "Xiaomi".equals(Build.MODEL) || "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean isMeizu() {
        return "meizu".equals(Build.MODEL) || "meizu".equals(Build.MANUFACTURER);
    }
}
