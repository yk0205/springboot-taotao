package com.yk.service;

import com.yk.comment.pojo.EasyUIDataGridResult;

public interface ContentService {


    EasyUIDataGridResult getContentListByCategoryId(Long categoryId, Integer page, Integer rows);
}
