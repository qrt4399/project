package com.example.project.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.project.core.entity.Paper;
import com.example.project.core.service.PaperService;
import com.example.project.core.mapper.PaperMapper;
import org.springframework.stereotype.Service;

/**
* @author 17218
* @description 针对表【paper】的数据库操作Service实现
* @createDate 2023-12-02 17:26:56
*/
@Service
public class PaperServiceImpl extends ServiceImpl<PaperMapper, Paper>
    implements PaperService{

}




