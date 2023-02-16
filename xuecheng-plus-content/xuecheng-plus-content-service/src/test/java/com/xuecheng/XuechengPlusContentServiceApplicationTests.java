package com.xuecheng;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class XuechengPlusContentServiceApplicationTests {

    @Resource
    private CourseBaseMapper courseBaseMapper;

    @Resource
    private CourseBaseInfoService courseBaseInfoService;


    @Test
    public void testCourseBaseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(22);
        System.out.println(courseBase);
        Assertions.assertNotNull(courseBase);
    }

    @Test
    void testCourseBaseInfoService() {
        PageParams pageParams = new PageParams();
        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
        System.out.println(courseBasePageResult);
    }

}
