package com.yk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.common.pojo.EasyUIDataGridResult;
import com.yk.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 内容分类管理
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @Reference
    private ContentService contentService;

    @ResponseBody
    @RequestMapping("/query/list")
    public EasyUIDataGridResult getContentListByCategoryId(Long categoryId, Integer page, Integer rows) {
        EasyUIDataGridResult result = contentService.getContentListByCategoryId(categoryId, page, rows);
        return result;
    }



}
