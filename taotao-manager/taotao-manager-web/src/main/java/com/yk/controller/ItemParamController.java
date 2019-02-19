package com.yk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.comment.pojo.EasyUIDataGridResult;
import com.yk.service.ItemParamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Reference
    private ItemParamService itemParamService;


    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemParamList(Integer page, Integer rows) {

        EasyUIDataGridResult result =  itemParamService.getItemParamList(page,rows);
        return  result;
    }




}
