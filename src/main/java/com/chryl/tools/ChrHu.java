package com.chryl.tools;

import com.chryl.po.PmsBrand;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrHu {
    public static List<PmsBrand> pmsBrandList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        PmsBrand pmsBrand1 = new PmsBrand(1L, "1", 1);
        PmsBrand pmsBrand2 = new PmsBrand(2L, "2", 1);
        PmsBrand pmsBrand3 = new PmsBrand(3L, "3", 1);
        pmsBrandList.add(pmsBrand1);
        pmsBrandList.add(pmsBrand2);
        pmsBrandList.add(pmsBrand3);
    }
}
