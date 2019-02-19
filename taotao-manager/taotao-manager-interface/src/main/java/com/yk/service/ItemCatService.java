package com.yk.service;

import com.yk.comment.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {


    List<EasyUITreeNode> getItemCatList(Long parentId);


}
