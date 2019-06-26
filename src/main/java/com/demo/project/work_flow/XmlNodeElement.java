package com.demo.project.work_flow;

/**
 * @description: xml变量名称枚举
 * @author: liujun 249489478@qq.com
 * @create: 2019-06-26 09:42
 */
public enum XmlNodeElement {
    /**
     * 工作流根节点
     */
    workflow_app("workflow-app"),
    /**
     * 开始节点
     */
    start("start"),
    /**
     * 工作流执行节点
     */
    action("action"),
    /**
     * 结束节点
     */
    end("end"),
    /**
     * bean实体对象
     */
    bean("bean"),
    /**
     * 异常信息节点
     */
    exception("exception");
    String name;
    XmlNodeElement(String name){
        this.name = name;
    }
}
