package com.example.together.model;

import java.util.List;

public class DataItem {

    private String categoryId;
    private String categoryName;
    private String isChecked = "NO";
    private List<com.example.together.model.SubCategoryItem> subCategory;

    public DataItem() {
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public List<com.example.together.model.SubCategoryItem> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<com.example.together.model.SubCategoryItem> subCategory) {
        this.subCategory = subCategory;
    }
}
