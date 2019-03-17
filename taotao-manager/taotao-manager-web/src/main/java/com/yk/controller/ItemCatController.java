package com.yk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yk.common.pojo.EasyUITreeNode;
import com.yk.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemCatController {


    @Reference
    private ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping("/cat/list")
    public List<EasyUITreeNode> getItemCatList(@RequestParam(name="id", defaultValue="0")Long parentId) {
        List<EasyUITreeNode> result = itemCatService.getItemCatList(parentId);
        return result;
    }


}
