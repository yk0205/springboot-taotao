package com.yk.mapper;

import com.yk.comment.pojo.EasyUIDataGridResult;
import com.yk.pojo.ContentCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentCategoryMapper {


    List<ContentCategory> getContentCategoryList();

}
