package com.example.project.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.project.core.entity.Student;
import com.example.project.core.service.StudentService;
import com.example.project.core.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author 17218
* @description 针对表【student】的数据库操作Service实现
* @createDate 2023-12-02 17:26:56
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




