package com.chryl.tools;

import cn.hutool.core.io.resource.ClassPathResource;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Chr.yl on 2020/4/17.
 *
 * @author Chr.yl
 */
public class ChrResourcesUtil {
    public static void main(String[] args) throws IOException {
        //        ClassPathResource
//        获取classPath下的文件，在Tomcat等容器下，classPath一般是WEB-INF/classes。

//获取定义在src/main/resources文件夹中的配置文件
        ClassPathResource resource = new ClassPathResource("generator.properties");
        Properties properties = new Properties();
        properties.load(resource.getStream());
        System.out.println(properties);
    }
}
