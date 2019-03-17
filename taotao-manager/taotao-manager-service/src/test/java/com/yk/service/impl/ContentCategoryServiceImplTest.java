package com.yk.service.impl;

import com.yk.common.pojo.EasyUITreeNode;
import com.yk.mapper.ContentCategoryMapper;
import com.yk.pojo.ContentCategory;
import com.yk.pojo.ContentCategoryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContentCategoryServiceImplTest {

    @Resource
    private ContentCategoryMapper contentCategoryMapper;

    @Test
    public void getContentCategoryListByParentId() {

        //根据父节点id查询子节点列表
        ContentCategoryExample example = new ContentCategoryExample();
        //设置查询条件
        ContentCategoryExample.Criteria criteria = example.createCriteria();
        //设置parentid
        criteria.andParentIdEqualTo(Long.valueOf(28));
        //执行查询
        List<ContentCategory> list = contentCategoryMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (ContentCategory cc : list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(cc.getId());
            node.setText(cc.getName());
            //如果节点下有子节点“closed”，如果没有子节点“open”
            node.setState(cc.getIsParent()?"closed":"open");
            //添加到节点列表
            resultList.add(node);
        }
        System.out.println(resultList);
    }

}