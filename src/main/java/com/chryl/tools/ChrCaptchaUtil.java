package com.chryl.tools;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrCaptchaUtil {
    public static void main(String[] args) {
        //        CaptchaUtil
        //        验证码工具类，可用于生成图形验证码。

        HttpServletRequest request = null;
        HttpServletResponse response = null;
        //生成验证码图片
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        try {
            request.getSession().setAttribute("CAPTCHA_KEY", lineCaptcha.getCode());
            response.setContentType("image/png");//告诉浏览器输出内容为图片
            response.setHeader("Pragma", "No-cache");//禁止浏览器缓存
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            lineCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
