package com.demo.project.work_flow;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @description: XML节点实体对象
 * @author: liujun 249489478@qq.com
 * @create: 2019-06-26 09:19
 */
@Setter
@Getter
@ToString
public final class XmlNode {
    private String id;
    private String name;
    /**
     * 类型,支持package、resource、url、class(仿myBatis-其实是为了加强记忆mybatis的加载方式)
     */
    private String type;
    //参数列表
    private List params;

    private String ref;
}

