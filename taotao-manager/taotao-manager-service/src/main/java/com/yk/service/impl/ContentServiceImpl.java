package com.yk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yk.common.pojo.EasyUIDataGridResult;
import com.yk.mapper.ContentMapper;
import com.yk.pojo.ItemParam;
import com.yk.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public EasyUIDataGridResult getContentListByCategoryId(Long categoryId, Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        List<ItemParam> list = contentMapper.getContentListByCategoryId(categoryId);
        //取分页信息
        PageInfo<ItemParam> pageInfo = new PageInfo<>(list);

        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(list);
        return result;

    }

}
