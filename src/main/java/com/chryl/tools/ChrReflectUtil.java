package com.chryl.tools;

import cn.hutool.core.util.ReflectUtil;
import com.chryl.po.PmsBrand;

import java.lang.reflect.Method;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrReflectUtil {
    public static void main(String[] args) {
        //        ReflectUtil
//        Java反射工具类，可用于反射获取类的方法及创建对象。

//获取某个类的所有方法
        Method[] methods = ReflectUtil.getMethods(PmsBrand.class);
//获取某个类的指定方法
        Method method = ReflectUtil.getMethod(PmsBrand.class, "getId");
//使用反射来创建对象
        PmsBrand pmsBrand = ReflectUtil.newInstance(PmsBrand.class);
//反射执行对象的方法
        ReflectUtil.invoke(pmsBrand, "setId", 1);
    }
}
