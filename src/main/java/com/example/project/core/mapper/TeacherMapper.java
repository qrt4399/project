package com.example.project.core.mapper;

import com.example.project.core.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 17218
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-12-02 17:26:56
* @Entity com.example.project.core.entity.Teacher
*/
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

}




