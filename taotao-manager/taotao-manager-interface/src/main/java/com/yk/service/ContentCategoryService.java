package com.yk.service;

import com.yk.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ContentCategoryService {


    List<EasyUITreeNode> getContentCategoryList(Long parentId);
}
