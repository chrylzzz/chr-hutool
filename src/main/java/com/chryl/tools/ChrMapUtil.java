package com.chryl.tools;

import cn.hutool.core.map.MapUtil;

import java.util.Map;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrMapUtil {
    public static void main(String[] args) {
        //        MapUtil
//        Map操作工具类，可用于创建Map对象及判断Map是否为空。

//将多个键值对加入到Map中
        Map<Object, Object> map = MapUtil.of(
                new String[][]{
                        {"key1", "value1"},
                        {"key2", "value2"},
                        {"key3", "value3"}
                });
//判断Map是否为空
        MapUtil.isEmpty(map);
        MapUtil.isNotEmpty(map);

    }
}
