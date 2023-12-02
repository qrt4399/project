package com.example.project.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.project.core.entity.QuestionType;
import com.example.project.core.service.QuestionTypeService;
import com.example.project.core.mapper.QuestionTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 17218
* @description 针对表【question_type】的数据库操作Service实现
* @createDate 2023-12-02 17:26:56
*/
@Service
public class QuestionTypeServiceImpl extends ServiceImpl<QuestionTypeMapper, QuestionType>
    implements QuestionTypeService{

}




