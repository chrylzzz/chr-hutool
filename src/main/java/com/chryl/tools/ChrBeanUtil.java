package com.chryl.tools;

import cn.hutool.core.bean.BeanUtil;
import com.chryl.po.PmsBrand;

import java.util.Map;

import static com.chryl.tools.ChrHu.pmsBrandList;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrBeanUtil {
    public static void main(String[] args) {
        //        BeanUtil
//        JavaBean的工具类，可用于Map与JavaBean对象的互相转换以及对象属性的拷贝。

        PmsBrand brand = new PmsBrand();
        brand.setId(1L);
        brand.setName("小米");
        brand.setShowStatus(0);
        //Bean转Map
        Map<String, Object> map = BeanUtil.beanToMap(brand);
        System.out.println(map);
//        PmsBrand pmsBrand1 = new PmsBrand(1L, "1", 1);//
//        Map<String, Object> map1 = BeanUtil.beanToMap(pmsBrand1, map, false, false);
//        System.out.println(map1);
        //Map转Bean
        PmsBrand mapBrand = BeanUtil.mapToBean(map, PmsBrand.class, false);
        System.out.println(mapBrand);
        //Bean属性拷贝
        PmsBrand copyBrand = new PmsBrand();
        BeanUtil.copyProperties(brand, copyBrand);
        System.out.println(copyBrand);
    }
}
