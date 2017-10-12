package com.sabrimonaf.lists;

/**
 * Created by Sabri on 10/9/17.
 */

public class Contact {

    private String name;
    private String phone;
    private String email;
    private int imgRes;

    public Contact(String name, String phone, String email, int imgRes) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.imgRes = imgRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }


    @Override
    public String toString() {
        return "The contact named " + getName() + ", his phone number is " + getPhone() +
                ", you can reach him by email on " + getEmail() + ".";
    }
}
