package com.demo.project.work_flow.exception;

/**
 * @description: 工作流异常类
 * @author: liujun 249489478@qq.com
 * @create: 2019-06-26 10:47
 */
public class WorkFlowException extends RuntimeException {
    public WorkFlowException(){
        super();
    }

    public WorkFlowException(String message){
        super(message);
    }

}
