package com.yk.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yk.comment.pojo.EasyUIDataGridResult;
import com.yk.mapper.ItemMapper;
import com.yk.pojo.Item;
import com.yk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        List<Item> list = itemMapper.getItemList();
        //取分页信息
        PageInfo<Item> pageInfo = new PageInfo<>(list);

        //创建返回结果对象
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(pageInfo.getTotal());
        result.setRows(list);

        return result;
    }

    @Override
    public Item getItemById(Long itemId) {
        Item item = itemMapper.selectByPrimaryKey(itemId);
        return null;
    }
}


