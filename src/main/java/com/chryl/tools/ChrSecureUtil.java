package com.chryl.tools;

import cn.hutool.crypto.SecureUtil;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrSecureUtil {
    public static void main(String[] args) {
        //        ChrSecureUtil
//        加密解密工具类，可用于MD5加密。
//
//MD5加密
        String str = "123456";
        String md5Str = SecureUtil.md5(str);
//        LOGGER.info("secureUtil md5:{}", md5Str);

    }
}
