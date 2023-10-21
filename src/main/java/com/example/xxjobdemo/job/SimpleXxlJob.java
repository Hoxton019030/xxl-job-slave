package com.example.xxjobdemo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SimpleXxlJob {
    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler(String jobParam){

        System.out.println("執行定時任務，執行時間"+new Date());
        System.out.println("收到的參數"+jobParam);
        return new ReturnT<>(ReturnT.SUCCESS_CODE,"成功");

    }
}
