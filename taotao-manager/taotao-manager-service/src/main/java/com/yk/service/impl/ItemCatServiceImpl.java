package com.yk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yk.common.pojo.EasyUITreeNode;
import com.yk.mapper.ItemCatMapper;
import com.yk.pojo.ItemCat;
import com.yk.pojo.ItemCatExample;
import com.yk.service.ItemCatService;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {


    @Resource
    private ItemCatMapper itemCatMapper;


    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) {
        //根据父节点id查询子节点列表
        ItemCatExample example = new ItemCatExample();
        //设置查询条件
        ItemCatExample.Criteria criteria = example.createCriteria();
        //设置parentid
        criteria.andParentIdEqualTo(parentId);
        //执行查询
        List<ItemCat> list = itemCatMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (ItemCat itemCat : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            //如果节点下有子节点“closed”，如果没有子节点“open”
            node.setState(itemCat.getIsParent()?"closed":"open");
            //添加到节点列表
            resultList.add(node);
        }
        return resultList;
    }
}
