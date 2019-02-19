package com.yk.controller;

import com.yk.comment.pojo.EasyUITreeNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemCatController {


    @Resource
    private ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping("/cat/list")
    public List<EasyUITreeNode> getItemCatList(@RequestParam(name="id", defaultValue="0")Long parentId) {
        List<EasyUITreeNode> result = itemCatService.getItemCatList(parentId);
        return result;
    }


}
