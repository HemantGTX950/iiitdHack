package com.naanizcustomer.naaniz.models;

/**
 * Created by hemba on 6/19/2017.
 */

public class Items {
    private String mCategory,mItemName,mPriceType;
    private int mSoldBy;
    private Double mPrice;

    public Items(String category, String itemName, String priceType, int soldBy, Double price) {
        mCategory = category;
        mItemName = itemName;
        mPriceType = priceType;
        mSoldBy = soldBy;
        mPrice = price;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
    }

    public String getPriceType() {
        return mPriceType;
    }

    public void setPriceType(String priceType) {
        mPriceType = priceType;
    }

    public int getSoldBy() {
        return mSoldBy;
    }

    public void setSoldBy(int soldBy) {
        mSoldBy = soldBy;
    }

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double price) {
        mPrice = price;
    }
}
