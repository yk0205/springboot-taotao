package com.yk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yk.comment.pojo.EasyUIDataGridResult;
import com.yk.mapper.ContentCategoryMapper;
import com.yk.pojo.ContentCategory;
import com.yk.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

    @Autowired
    private ContentCategoryMapper contentCategoryMapper;

    @Override
    public EasyUIDataGridResult getContentCategoryList(Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        List<ContentCategory> list = contentCategoryMapper.getContentCategoryList();
        //取分页信息
        PageInfo<ContentCategory> pageInfo = new PageInfo<>(list);

        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(list);
        return result;
    }
}
