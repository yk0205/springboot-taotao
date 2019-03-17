package com.yk.service;

import com.yk.common.pojo.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {


    List<EasyUITreeNode> getItemCatList(Long parentId);


}
