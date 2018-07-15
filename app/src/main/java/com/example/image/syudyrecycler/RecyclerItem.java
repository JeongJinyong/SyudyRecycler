package com.example.image.syudyrecycler;

import android.graphics.drawable.Drawable;

public class RecyclerItem {
    Drawable img;
    String nm;
    String msg;

    public RecyclerItem(Drawable img, String nm, String msg){
        this.img = img;
        this.nm = nm;
        this.msg = msg;
    }
    public RecyclerItem(Drawable img){
        this.img = img;
    }

    public Drawable getImg() {
        return img;
    }

    public String getNm() {
        return nm;
    }

    public String getMsg() {
        return msg;
    }
}
