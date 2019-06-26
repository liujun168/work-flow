package com.demo.project.work_flow;

import com.demo.project.work_flow.exception.WorkFlowException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

//@SpringBootApplication
public class WorkFlowApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(WorkFlowApplication.class, args);
//    }

    public void getPath() throws IOException {
        System.out.println(System.getProperty("user.dir"));//user.dir指定了当前的路径

//        java.net.URL uri = this.getClass().getResource("/");
//        System.out.println(uri);
//
//        String fileName = this.getClass().getClassLoader().getResource("workflow").getPath();//获取文件路径
//        String fileUtl = this.getClass().getResource("workflow").getFile();
//
//        System.out.println(fileName);
//        System.out.println(fileUtl);

        File directory = new File("");//参数为空
        String courseFile = directory.getCanonicalPath();//标准的路径 ;
        String author =directory.getAbsolutePath();//绝对路径;
        System.out.println(courseFile);
        System.out.println(author);
    }

    public static void path() throws Exception{
        Resource resource = new ClassPathResource("workflow-demo.xml");
        String Path = resource.getFile().getPath();
        System.out.println(Path);
    }
    public static void main(String[] args) throws Exception {
//        Test test =new Test();
//        test.getPath();

//        Resource resource = new ClassPathResource("workflow-demo.xml");
//        String Path = resource.getFile().getPath();
//        System.out.println(Path);

//        XmlNode xml = new XmlNode();
//        xml.setName("342");
//        System.out.println(xml);
//        path();
//
//        Resource resource = new ClassPathResource("");
//        String Path = resource.getFile().getPath();
//        System.out.println(Path);

        //异常
//         throw  new WorkFlowException("ewrwe");

    }
}
