package com.yk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.common.pojo.EasyUITreeNode;
import com.yk.service.ContentCategoryService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/content")
public class ContentCategoryController {

    @Reference
    private ContentCategoryService contentCategoryService;

    @ResponseBody
    @RequestMapping("/category/list")
    public List<EasyUITreeNode> getContentCategoryList(@RequestParam(value="id", defaultValue="28") Long parentId) {

        List<EasyUITreeNode> result = contentCategoryService.getContentCategoryList( parentId);
        return result;
    }


}
