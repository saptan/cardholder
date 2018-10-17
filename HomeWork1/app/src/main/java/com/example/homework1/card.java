package com.example.homework1;

import java.io.Serializable;

public class card implements Serializable{
    private  int  ID;
    private String Title;
    private String Photo;

    public int  getID() {
        return ID;
    }

    public void setID(int  ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }
}


