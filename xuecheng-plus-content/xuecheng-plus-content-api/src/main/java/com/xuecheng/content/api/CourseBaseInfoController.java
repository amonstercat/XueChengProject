package com.xuecheng.content.api;


import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class CourseBaseInfoController {

    @Resource
    CourseBaseInfoService courseBaseInfoService;


    //      @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
//     将传过来的json数据转换为对象
//     而最常用的使用请求体传参的无疑是POST请求了，所以使用@RequestBody接收数据时，
//     一般都用POST方式进行提交
    @PostMapping("/course/list")
    @ApiOperation("课程查询接口")
    public PageResult<CourseBase> list(PageParams params,
                                       @RequestBody QueryCourseParamsDto queryCourseParamsDto) {

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(params, queryCourseParamsDto);
        return courseBasePageResult;
    }

}
