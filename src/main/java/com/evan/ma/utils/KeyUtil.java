package com.evan.ma.utils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Version 1.0
 * @Author: chj
 * @Date: 2021/11/18
 */
public class KeyUtil {
    private static AtomicInteger atomicInteger = new AtomicInteger(1);

    public static String getKey() {
        if (atomicInteger.get() >= 1000000) {
            atomicInteger.set(1);
        }
        return String.format("%s%s", System.currentTimeMillis(), replaceLeft(6, '0', String.valueOf(atomicInteger.getAndAdd(1))));
    }

    private static String replaceLeft(int len, char c, String s) {
        int cLen = s.length();
        if (cLen < len) {
            StringBuffer stringBuffer = new StringBuffer(s);
            while (cLen++ < len) {
                stringBuffer.insert(0, c);
            }
            s = stringBuffer.toString();
        }
        return s;
    }
}
