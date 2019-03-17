package com.yk.service;


import com.yk.common.pojo.EasyUIDataGridResult;
import com.yk.pojo.Item;

public interface ItemService {


    EasyUIDataGridResult getItemList(Integer page, Integer rows);


    Item getItemById(Long itemId);


}
