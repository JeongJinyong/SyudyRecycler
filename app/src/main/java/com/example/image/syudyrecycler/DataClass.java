package com.example.image.syudyrecycler;

import android.content.Context;
import android.content.res.TypedArray;

public class DataClass {
    Context mContext;

    public DataClass(Context context){
        mContext = context;
    }

    public TypedArray getImageList(){
        return mContext.getResources().obtainTypedArray(R.array.img_array);
    }

    public String[] getNameList(){
        return mContext.getResources().getStringArray(R.array.nm_array);
    }
    public String[] getMsgList(){
        return mContext.getResources().getStringArray(R.array.msg_array);
    }
}
