package com.yk.mapper;


import com.yk.pojo.Item;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemMapper {


    List<Item> getItemList();


    Item selectByPrimaryKey(Long itemId);


}