package com.chryl.tools;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrCollUtil {
    public static void main(String[] args) {
        //        CollUtil
//        集合操作的工具类，定义了一些常用的集合操作。

        //数组转换为列表
        String[] array = new String[]{"a", "b", "c", "d", "e"};
        List<String> list = CollUtil.newArrayList(array);
        System.out.println(list);

        //join：数组转字符串时添加连接符号
        String joinStr = CollUtil.join(list, ",");
        System.out.println(joinStr);

        //将以连接符号分隔的字符串再转换为列表
        List<String> splitList = StrUtil.split(joinStr, ',');
        System.out.println(splitList);

        //创建新的Map、Set、List
        HashMap<Object, Object> newMap = CollUtil.newHashMap();
        System.out.println(newMap);
        HashSet<Object> newHashSet = CollUtil.newHashSet();
        System.out.println(newHashSet);
        ArrayList<Object> newList = CollUtil.newArrayList();
        System.out.println(newList);

        //判断列表是否为空
        boolean empty = CollUtil.isEmpty(list);
        System.out.println(empty);

    }
}
