package com.yk.service;

import com.yk.comment.pojo.EasyUITreeNode;

import java.util.List;

public interface ContentCategoryService {


    List<EasyUITreeNode> getContentCategoryList(Long parentId);
}
