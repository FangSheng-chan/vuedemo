package com.ss.vue.entity;

import java.util.Date;

public class Food {
    private Long id;
    private String name;
    private String images;
    private Long price;
    private Long salePrice;
    private Long typeId;
    private String typeName;
    private Boolean flag;
    private Date createTime;
    private Date updateTime;

    public Food() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Food(Long id, String name, String images, Long price, Long salePrice, Long typeId, String typeName, Boolean flag, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.images = images;
        this.price = price;
        this.salePrice = salePrice;
        this.typeId = typeId;
        this.typeName = typeName;
        this.flag = flag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
