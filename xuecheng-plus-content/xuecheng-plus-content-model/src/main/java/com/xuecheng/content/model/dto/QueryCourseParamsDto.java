package com.xuecheng.content.model.dto;

import lombok.Data;

@Data
public class QueryCourseParamsDto {

    /*三个查询条件*/


    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
