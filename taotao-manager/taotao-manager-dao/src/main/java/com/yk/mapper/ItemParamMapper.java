package com.yk.mapper;

import com.yk.pojo.Item;
import com.yk.pojo.ItemParam;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemParamMapper {


    List<ItemParam> getItemParamList();

}
