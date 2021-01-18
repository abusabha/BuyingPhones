package com.abusabha.buyingphones.model;

import androidx.annotation.DrawableRes;

import java.io.Serializable;


public class Phone implements Serializable {
    private String phoneModel;
    private String phonePrice;
    private int image;
    private int store;

    public Phone(String phoneModel, String phonePrice, @DrawableRes int image, int store) {
        this.phoneModel = phoneModel;
        this.phonePrice = phonePrice;
        this.image = image;
        this.store = store;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(String phonePrice) {
        this.phonePrice = phonePrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
