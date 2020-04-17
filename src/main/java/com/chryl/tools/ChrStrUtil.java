package com.chryl.tools;

import cn.hutool.core.util.StrUtil;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrStrUtil {
    public static void main(String[] args) {
        //        StrUtil
//        字符串工具类，定义了一些常用的字符串操作方法。

//判断是否为空字符串
        String str = "test";
        StrUtil.isEmpty(str);
        StrUtil.isNotEmpty(str);
//去除字符串的前后缀
        StrUtil.removeSuffix("a.jpg", ".jpg");
        StrUtil.removePrefix("a.jpg", "a.");
//格式化字符串
        String template = "这只是个占位符:{}";//hu
        String template2 = "这只是个占位符:%s";//java
        String str2 = StrUtil.format(template, "我是占位符");
        System.out.println(str2);
        String zzzzz = String.format(template2, "zzzzz");
        System.out.println(zzzzz);
    }
}
