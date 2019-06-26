package com.demo.project.work_flow;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * @description: 解析工作流程的XML
 * @author: liujun 249489478@qq.com
 * @create: 2019-06-26 09:18
 */
public class SaxParseHandler extends DefaultHandler {

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("<" + qName + ">");
        if("bean".equals(qName)){

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("</" + qName + ">");
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        super.characters(ch, start, length);
        //new String(ch, start, length)用来生成一个元素中标签之间的具体的文本
        String value = new String(ch, start, length);//加入正好解析到<name>冰与火之歌</name>时，那么value="冰与火之歌"
//        System.out.println("================节点值是：" + value);
        System.out.print(value);
        if (!value.trim().equals("")) {
//            System.out.println("节点值是：" + value);
        }
//        if(!"\n".equals(str)){
//            System.out.print(str);
//        }
    }

    public static void main(String[] args) {
        try {
            Resource resource = new ClassPathResource("workflow.xml");
            String path = resource.getFile().getPath();
            File inputFile = new File(path);

            // 创建sax解析工厂
            SAXParserFactory factory = SAXParserFactory.newInstance();
            // 创建sax转换工具
            SAXParser saxParser = factory.newSAXParser();
            // 解析xml
            saxParser.parse(inputFile, new SaxParseHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

