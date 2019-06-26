package com.demo.project.work_flow.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

/**
 * @description: 加载XML配置文件工具类
 * @author: liujun 249489478@qq.com
 * @create: 2019-06-26 10:44
 */
public final class XmlResourcePath {

    private static String basePath = "";

    static {
        Resource resource = new ClassPathResource("");
        try {
            basePath = resource.getFile().getPath();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public XmlResourcePath(String path) {
//        Resource resource = new ClassPathResource("");
//        String Path = resource.getFile().getPath();
//        System.out.println(Path);
    }

    public static void main(String[] args) {
        File f = new File(basePath);
//        System.out.println(basePath);
        File[] list = f.listFiles();
        for (File file : list) {
            if(file.getName().endsWith(".xml")){
                System.out.println(file.getPath());
            }
        }

    }
}
