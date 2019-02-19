package com.yk.mapper;

import com.yk.pojo.ItemParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentMapper {

    List<ItemParam> getContentListByCategoryId(Long categoryId);
}
