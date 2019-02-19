package com.yk.pojo;

import java.io.Serializable;
import java.util.Date;

public class ItemParam implements Serializable {

    private Long id;

    private String itemCatId;

    private String paramData;

    private Date created;

    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(String itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}



