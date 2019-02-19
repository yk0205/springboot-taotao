package com.yk.controller;

import com.yk.comment.pojo.EasyUIDataGridResult;
import com.yk.pojo.Item;
import com.yk.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/item")
public class ItemParamController {

    @Resource
    private ItemService itemService;

    @GetMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {

        EasyUIDataGridResult result =  itemService.getItemList(page,rows);
        return  result;
    }

    @GetMapping("/{itemId}")
    @ResponseBody
    public Item getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

    @GetMapping("/param/list")
    @ResponseBody
    public EasyUIDataGridResult getItemParamList(Integer page, Integer rows) {

        EasyUIDataGridResult result =  itemService.getItemList(page,rows);
        return  result;
    }




}
